package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasketTest {

    @Test
    public void addNewItemToBasket() {
        Basket basket = new Basket();
        String product = "Apple";
        int price = 12;

        assertTrue(basket.add(product, price));
    }
}
