package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void addItemThatDoesNotExist() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("milk", 2));
    }

    @Test
    public void addItemThatAlreadyExists() {
        Basket basket = new Basket();
        basket.items.put("butter", 4);
        Assertions.assertFalse(basket.add("butter", 4));
    }

    @Test
    public void getCorrectTotalCost() {
        Basket basket = new Basket();
        basket.items.put("butter", 4);
        basket.items.put("milk", 2);
        basket.items.put("coffee", 7);
        Assertions.assertEquals(13, basket.total());
    }

    @Test
    public void getWrongTotalCost() {
        Basket basket = new Basket();
        basket.items.put("butter", 4);
        basket.items.put("milk", 2);
        basket.items.put("coffee", 7);
        Assertions.assertNotEquals(10, basket.total());
    }
}
