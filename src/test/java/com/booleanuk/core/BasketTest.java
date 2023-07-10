package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class BasketTest {

    Basket basket;

    public BasketTest() {
        this.basket = new Basket();
    }

    @Test
    public void providedNameShouldReturnTrue() {
        Map<String, Integer> itemMap = new HashMap<>();
        itemMap.put("Coffee", 4);
        itemMap.put("Tea", 3);
        Assertions.assertTrue(basket.add("Coffee",4));
    }

    @Test
    public void providedNameShouldReturnFalse() {
        Map<String, Integer> itemMap2 = new HashMap<>();
        itemMap2.put("Coffee", 4);
        itemMap2.put("Tea", 3);
        Assertions.assertFalse(basket.add("FalseCoffee",4));
    }

    @Test
    public void checkTotalPrice() {
        Map<String, Integer> itemMap2 = new HashMap<>();
        itemMap2.put("Coffee", 4);
        itemMap2.put("Tea", 3);
        Assertions.assertEquals(7, basket.total());
    }

}
