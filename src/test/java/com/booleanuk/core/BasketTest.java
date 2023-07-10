package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    public void shouldReturnFalse() {
        Basket basket = new Basket();
        basket.add("apple", 3);
        boolean result = basket.add("apple", 5);
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnTrue() {
        Basket basket = new Basket();
        boolean result = basket.add("orange", 2);
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldCalculateTotalCost() {
        Basket basket = new Basket();
        basket.add("apple", 3);
        basket.add("orange", 2);
        int result = basket.calculateTotalCost();
        Assertions.assertEquals(5, result);
    }
}
