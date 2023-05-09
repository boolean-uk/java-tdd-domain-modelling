package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    public void testAddItem(){
        Basket basket = new Basket();

        // when item not exists
        boolean result = basket.addItems("Product A", 22);
        Assertions.assertTrue(result);

        // when item exists
        result = basket.addItems("Product A", 22);
        Assertions.assertFalse(result);

    }
    @Test
    public void testTotal(){
        Basket basket = new Basket();
        int expected=0;
        int actual = basket.total();
        // When empty
        Assertions.assertEquals(expected,actual);

        // when not empty
        basket.addItems("Product A", 10);
        basket.addItems("Product B", 20);

        Assertions.assertEquals(expected,actual);
    }

}
