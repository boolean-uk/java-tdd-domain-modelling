package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasketTest {
    private Basket basket;
    @BeforeEach
    public void initializeBasket() {
        basket = new Basket();
    }
    @Test
    @DisplayName("Items:Map must be instantiated and empty")
    public void testBasketInitialState() {
        Assertions.assertTrue(basket.items.isEmpty());
    }

    @Test
    public void testAddItemInBasket() {
        Assertions.assertTrue(basket.add("Carrots",3));
    }
    @Test
    public void testAddDuplicateItemInBasket() {
        Assertions.assertTrue(basket.add("Carrots",3));
        Assertions.assertFalse(basket.add("Carrots",3));
    }

    @Test
    public void getTotalCostOfItemsInBasket() {
        basket.add("Carrots",3);
        basket.add("Carrots",3);
        basket.add("Apples",4);
        Assertions.assertEquals(7, basket.total());
    }
}
