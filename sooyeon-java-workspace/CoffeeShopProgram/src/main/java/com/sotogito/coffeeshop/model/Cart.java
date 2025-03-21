package com.sotogito.coffeeshop.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final HashMap<Product, Integer> orders = new HashMap<>();
    private static int purchaseAmount = 0;


    public void addCart(Product product) {
        if (orders.containsKey(product)) {
            orders.put(product, orders.get(product) + 1);
        } else {
            orders.put(product, 1);
        }
        purchaseAmount += product.getPrice();
    }

    public int calculateBalance(int userAmount) {
        return userAmount - purchaseAmount;
    }

    public boolean isEmpty() {
        return orders.isEmpty();
    }

    public Map<Product, Integer> getOrders() {
        return Collections.unmodifiableMap(orders);
    }

    public void clear() {
        orders.clear();
        purchaseAmount = 0;
    }

}
