package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class BasketTest {

    @Test
    void addCorrectly() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.add("product4", 20));

        basket.add("product1", 5);
        Assertions.assertFalse(basket.add("product1", 5));
    }

    @Test
    void addCorrectly2() {
        Basket basket = new Basket();

        basket.add("product1", 5);
        Assertions.assertFalse(basket.add("product1", 5));
    }

    @Test
    void calculateCorrectly() {
        Basket basket = new Basket();

        basket.add("product1", 5);
        basket.add("product2", 10);
        basket.add("product3", 15);

        Assertions.assertEquals(30, basket.total());

    }

}
