package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    public void addTest() {
        Basket basket = new Basket();
        String product = "Juice";
        int price = 5;
        Assertions.assertEquals(true, basket.add(product, price));
    }

    @Test
    public void addDuplicatedTest() {
        Basket basket = new Basket();
        String product = "Juice";
        int price = 5;
        basket.add(product, price);
        Assertions.assertEquals(false, basket.add(product, price));
    }

    @Test
    public void totalTest() {
        Basket basket = new Basket();
        String product = "Juice";
        int price = 5;
        basket.add(product, price);
        Assertions.assertTrue(basket.total() > 0);
    }
}
