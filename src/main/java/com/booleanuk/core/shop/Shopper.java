package com.booleanuk.core.shop;

import java.math.BigDecimal;

public class Shopper {
    private BigDecimal balance;
    private final Basket basket = new Basket();

    public Shopper(BigDecimal balance) {
        this.balance = balance;
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
        if (basketPrice.compareTo(balance) > 0) {
            throw new IllegalStateException("Insufficient funds to pay for basket");
        }
        balance = balance.subtract(basketPrice);
        basket.clear();

        System.out.println("Shopper balance after purchase: " + balance);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getReceipt(){
        return basket.receipt().toString();
    }
}
