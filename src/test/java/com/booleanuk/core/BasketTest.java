package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class BasketTest {
    @Test
    public void testSearchReturnsFalse(){
        Basket basket = new Basket();

        basket.add("banana", 2);
        basket.add("apple", 1);
        basket.add("milk", 4);
        String name = "mango";
        boolean result = basket.search(name);

        Assertions.assertFalse(result);
    }
    @Test
    public void testSearchReturnsTrue(){
        Basket basket = new Basket();

        basket.add("banana", 2);
        basket.add("apple", 1);
        basket.add("milk", 4);
        String name = "milk";
        boolean result = basket.search(name);

        Assertions.assertTrue(result);
    }
    @Test
    public void testSearchReturnsFive(){
        Basket basket = new Basket();

        basket.add("banana", 2);
        basket.add("apple", 1);
        basket.add("milk", 4);
        String name = "milk";
        int result = basket.total();

        Assertions.assertEquals(5, result);
    }
}
