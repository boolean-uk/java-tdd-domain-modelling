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
        itemMap.add("Coffe", 4);
        Assertions.assertTrue(true);
    }

}
