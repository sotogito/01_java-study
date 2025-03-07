package com.sotogito.coffeeshop.dao;

import com.sotogito.coffeeshop.model.Product;
import com.sotogito.coffeeshop.model.Shop;

import java.util.List;

public class ShopProductManager {
    ;
    private final Shop shop;
    private int minimumPrice = 0;

    public ShopProductManager(Shop shop) {
        this.shop = shop;
        minimumPrice = this.shop.findMinimumPrice();
    }

    public List<Product> getCoffeeList() {
        return shop.getCoffees();
    }

    public List<Product> getBreadList() {
        return shop.getBreads();
    }

    public void addNewCoffeeProduct(Product product) {
        if (product.getPrice() < minimumPrice) {
            minimumPrice = product.getPrice();
        }
        shop.addProduct(product);
    }

    public Product findProductByName(String name) {
        return shop.findProductByName(name);
    }

    public int getMinimumPrice() {
        return minimumPrice;
    }

}
