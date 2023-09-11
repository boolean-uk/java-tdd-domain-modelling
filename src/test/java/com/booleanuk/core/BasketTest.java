package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    public void testAddProductToBasket() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("Apple", 2));
        Assertions.assertEquals(1, basket.items.size());
        Assertions.assertTrue(basket.items.containsKey("Apple"));
        Assertions.assertEquals(2, basket.items.get("Apple").intValue());
    }

    @Test
    public void testAddDuplicateProductToBasket() {
        Basket basket = new Basket();
        basket.add("Banana", 3);
        Assertions.assertFalse(basket.add("Banana", 2));
        Assertions.assertEquals(1, basket.items.size());
        Assertions.assertTrue(basket.items.containsKey("Banana"));
        Assertions.assertEquals(3, basket.items.get("Banana").intValue());
    }

    @Test
    public void testTotalWithEmptyBasket() {
        Basket basket = new Basket();
        Assertions.assertEquals(0, basket.total());
    }

    @Test
    public void testAddMultipleProductsToBasket() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("Orange", 4));
        Assertions.assertTrue(basket.add("Grapes", 5));
        Assertions.assertEquals(2, basket.items.size());
    }

    @Test
    public void testAddAndGetTotalWithEmptyBasket() {
        Basket basket = new Basket();
        Assertions.assertEquals(0, basket.total());
    }

    @Test
    public void testTotalWithProductsInBasket() {
        Basket basket = new Basket();
        basket.add("Orange", 4);
        basket.add("Grapes", 5);
        Assertions.assertEquals(9, basket.total());
    }

    @Test
    public void testAddProductWithNegativePriceToBasket() {
        Basket basket = new Basket();
        Assertions.assertFalse(basket.add("Chips", -2)); // Negative price should not be accepted
        Assertions.assertEquals(0, basket.items.size());
    }
}