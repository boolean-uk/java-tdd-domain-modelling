package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void testAddResultFalse(){
        Basket basket = new Basket();
        basket.add("book", 8);
        Assertions.assertFalse(basket.add("book", 8));
    }

    @Test
    public void testAddResultTrue(){
        Basket basket = new Basket();
        basket.add("book", 8);
        Assertions.assertTrue(basket.add("chair", 50));
    }

    @Test
    public void testTotal(){
        Basket basket = new Basket();
        basket.add("book", 8);
        basket.add("chair", 50);
        basket.add("flower", 2);
        Assertions.assertEquals(60,basket.total());
    }
}
