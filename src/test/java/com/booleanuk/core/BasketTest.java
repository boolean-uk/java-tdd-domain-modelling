package com.booleanuk.core;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class BasketTest {

    @Test
    void testAdd(){
        Basket basket = new Basket();
        basket.items.put("apple",2);
        basket.items.put("orange",3);
        basket.items.put("banana",1);
        Assertions.assertFalse(basket.add("apple",1));
        Assertions.assertTrue(basket.add("pinapple",5));
    }
    @Test
    void testTotal(){
        Basket basket = new Basket();
        basket.items.put("apple",2);
        basket.items.put("orange",3);
        basket.items.put("banana",1);
        Assertions.assertEquals(6,basket.total());
    }
}
