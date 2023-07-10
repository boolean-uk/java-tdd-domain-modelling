package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BasketTest {
    @Test
    public void testSearchReturnsFalse(){
        Basket basket = new Basket();
        HashMap<String, Integer> items = new HashMap<>();
        items.put("banana", 2);
        items.put("apple", 1);
        items.put("milk", 4);
        String name = "mango";
        boolean result = basket.search(name);

        Assertions.assertFalse(result);
    }
}
