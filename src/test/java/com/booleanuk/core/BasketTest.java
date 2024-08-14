package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    Basket basket = new Basket();

    @Test
    public void addMethodExistTest() {
        Assertions.assertFalse(basket.add("", 0));
    }

    @Test
    public void addItemTest() {
        Assertions.assertFalse(basket.add("", 0));
        Assertions.assertTrue(basket.add("Milk", 5));
        Assertions.assertFalse(basket.add("Milk", 5));
        Assertions.assertTrue(basket.add("Bread", 2));
        Assertions.assertTrue(basket.add("Eggs", 3));
    }

    @Test
    public void totalTest() {
        Assertions.assertTrue(basket.add("Milk", 5));
        Assertions.assertTrue(basket.add("Bread", 2));
        Assertions.assertTrue(basket.add("Eggs", 3));
        Assertions.assertNotEquals(0, basket.total());
        Assertions.assertEquals(10, basket.total());

        Assertions.assertTrue(basket.add("Apple", 5));
        Assertions.assertEquals(15, basket.total());

    }


}
