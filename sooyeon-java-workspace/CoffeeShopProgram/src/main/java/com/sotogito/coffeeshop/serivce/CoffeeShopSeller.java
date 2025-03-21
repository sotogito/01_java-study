package com.sotogito.coffeeshop.serivce;

import com.sotogito.coffeeshop.dao.PaymentFileReader;
import com.sotogito.coffeeshop.dto.PaymentDetailsDTO;
import com.sotogito.coffeeshop.exception.payment.EmptyPaymentHistoryException;
import com.sotogito.coffeeshop.model.User;

import java.util.List;
import java.util.Map;


/**
 * 어차피 같은 pyment를 참조할거기 때문에 reader로 읽어주면 된다.
 */
public enum CoffeeShopSeller {
    COFFEE_SHOP_SELLER;

    private final PaymentFileReader reader = new PaymentFileReader();

    public Map<String, List<PaymentDetailsDTO>> getPaymentDetails() {
        Map<String, List<PaymentDetailsDTO>> paymentDetails = reader.readAllPaymentDetails();
        if (paymentDetails.isEmpty()) {
            throw new EmptyPaymentHistoryException("비어있습니다.");
        }
        return paymentDetails;
    }

    public Map<String, List<PaymentDetailsDTO>> getPaymentDetailsByUser(User user) {
        Map<String, List<PaymentDetailsDTO>> paymentDetails = reader.readUserPaymentDetails(user);
        if (paymentDetails.isEmpty()) {
            throw new EmptyPaymentHistoryException("구매 내역이 없습니다.");
        }
        return paymentDetails;
    }

}
