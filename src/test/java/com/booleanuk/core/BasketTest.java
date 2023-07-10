package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    public void addTest() {
        Basket basket = new Basket();
        String product = "Juice";
        int price = 5;
        Assertions.assertTrue(basket.add(product, price));
    }

    @Test
    public void addDuplicatedTest() {
        Basket basket = new Basket();
        String product = "Juice";
        int price = 5;
        basket.add(product, price);
        Assertions.assertFalse(basket.add(product, price));
    }

    @Test
    public void totalTest() {
        Basket basket = new Basket();
        String product = "Juice";
        int price = 5;
        basket.add(product, price);
        Assertions.assertEquals(5, basket.total());
    }

    @Test
    public void totalTestMultipleProducts() {
        Basket basket = new Basket();
        String productJuice = "Juice";
        int priceJuice = 5;
        String productBread = "Bread";
        int priceBread = 2;
        basket.add(productJuice, priceJuice);
        basket.add(productBread, priceBread);
        Assertions.assertEquals(7, basket.total());
    }
}
