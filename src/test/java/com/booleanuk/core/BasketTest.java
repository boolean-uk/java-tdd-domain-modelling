package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasketTest {

    @Test
    public void addNewItemToBasket() {
        Basket basket = new Basket();
        String product = "Apple";
        int price = 12;

        assertTrue(basket.add(product, price));
    }

    @Test
    public void addExistingItemToBasket() {
        Basket basket = new Basket();
        String product = "Apple";
        int price = 12;

        assertTrue(basket.add(product, price));
        assertFalse(basket.add(product, price+1));
    }
}
