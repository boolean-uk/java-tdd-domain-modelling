package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    public void testAddReturnsTrue() {
        // Setup
        Basket basket = new Basket();

        // Execute
        boolean added = basket.add("Apple", 3);

        // Verify
        Assertions.assertTrue(added);
    }

    @Test
    public void testAddReturnsFalse() {
        // Setup
        Basket basket = new Basket();
        basket.add("apple", 3);

        // Execute
        boolean added = basket.add("apple", 2);

        // Verify
        Assertions.assertFalse(added);
    }

    @Test
    public void testTotalItemsPrice() {
        // Setup
        Basket basket = new Basket();
        basket.add("apple", 3);
        basket.add("banana", 5);
        basket.add("nuts", 2);

        // Execute
        int total_price = basket.total();

        // Verify
        Assertions.assertEquals(10, total_price);
    }

    @Test
    public void testTotalItemsPriceOfEmptyMap() {
        // Setup
        Basket basket = new Basket();

        // Execute
        int total_price = basket.total();

        // Verify
        Assertions.assertEquals(0, total_price);
    }
}
