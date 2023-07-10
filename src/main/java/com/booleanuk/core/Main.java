package com.booleanuk.core;

import com.booleanuk.core.shop.Basket;
import com.booleanuk.core.shop.Product;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        var basket = new Basket();
        var milk = new Product("milk", BigDecimal.valueOf(7));
        var bread = new Product("bread", BigDecimal.valueOf(6));

        for (int i = 0; i < 3; i++) {
            basket.addProduct(milk);
        }
        for (int i = 0; i < 2; i++) {
            basket.addProduct(bread);
        }

        System.out.println(basket.receipt());
        System.out.println(basket.totalCost());
    }
}
