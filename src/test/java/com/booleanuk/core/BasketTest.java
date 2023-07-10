package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    void add_AddsNewItemsToList() {
        Basket basket = new Basket();
        HashMap<String, Integer> expectedItems = new HashMap<>();
        expectedItems.put("Item1", 1);
        expectedItems.put("Item2", 1);

        assertTrue(basket.add("Item1", 1));
        assertTrue(basket.add("Item2", 1));

        assertEquals(basket.getItems(), expectedItems);
    }

    @Test
    void add_DoesNotAddItemWhenKeyAlreadyExists() {
        Basket basket = new Basket();
        Map<String, Integer> expectedItems = new HashMap<>();
        expectedItems.put("Item1", 1);

        assertTrue(basket.add("Item1", 1));
        assertFalse(basket.add("Item1", 2));

        assertEquals(basket.getItems(), expectedItems);
    }

    @Test
    void total_ReturnsCorrectItemCount() {
        Basket basket = new Basket();
        basket.add("Item1", 1);
        basket.add("Item2", 1);
        basket.add("Item3", 1);

        assertEquals(basket.total(), 3);
    }
}