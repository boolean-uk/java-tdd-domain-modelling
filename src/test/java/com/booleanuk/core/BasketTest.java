package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void getTotalItemsCost() {
        Basket basket = new Basket();

        String apple = "Apple";
        int applePrice = 12;
        String banana = "Banana";
        int bananaPrice = 6;

        basket.add(apple, applePrice);
        basket.add(banana, bananaPrice);

        assertEquals(18, basket.total());
    }
}
