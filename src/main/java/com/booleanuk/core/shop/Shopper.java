package com.booleanuk.core.shop;

import java.math.BigDecimal;

public class Shopper {
    private BigDecimal cash;
    private final Basket basket = new Basket();

    public Shopper(BigDecimal cash) {
        this.cash = cash;
    }

    public void addToBasket(Product product) {
        basket.addProduct(product);
    }

    public void removeFromBasket(String name) {
        basket.removeProduct(name);
    }

    public BigDecimal checkBasketCost() {
        return basket.totalCost();
    }

    /*
    If Shopper can afford their basket - subtracts basket cost from shopper's balance and clears basket
    If Shopper can not afford their basket - throws Exception with a message
     */
    public void pay() {
        var basketPrice = basket.totalCost();
        if (basketPrice.compareTo(cash) > 0) {
            throw new IllegalStateException("Insufficient funds to pay for basket");
        }
        cash = cash.subtract(basketPrice);
        basket.clear();

        System.out.println("Shopper balance after purchase: " + cash);
    }

    public String getReceipt(){
        return basket.receipt().toString();
    }
}
