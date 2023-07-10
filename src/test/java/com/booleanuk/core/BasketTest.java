package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    void addUpdatesItemsList() {
        Basket basket = new Basket();
        assertTrue(basket.add("Item1", 1));
        assertTrue(basket.add("Item2", 1));
    }

    @Test
    void addNotPossibleKeyAlreadyExists() {
        Basket basket = new Basket();
        assertTrue(basket.add("Item1", 1));
        assertFalse(basket.add("Item1", 1));
    }

    @Test
    void returnsTotal() {
        Basket basket = new Basket();
        basket.add("Item1", 1);
        basket.add("Item2", 1);
        basket.add("Item3", 1);
        assertEquals(basket.total(), 3);
    }
}