package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void testAdd() {
        Basket basket = new Basket();
        basket.add("Banana", 5);
        Assertions.assertFalse(basket.add("Banana", 5));
        Assertions.assertTrue(basket.add("Pear", 3));
    }

    @Test
    public void testTotal() {
        Basket basket = new Basket();
        basket.add("Banana", 5);
        basket.add("Apple", 4);
        basket.add("Pear", 3);
        Assertions.assertEquals(12, basket.total());
    }
}
