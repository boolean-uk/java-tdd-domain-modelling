package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void testAddMethod_itemIsNotInTheList_shouldReturnTrue(){
        Basket basket = new Basket();
        String name1 = "Product1";
        int price1 = 2;
        Assertions.assertTrue(basket.add(name1, price1));
    }

    @Test
    public void testAddMethod_itemIsInTheList_shouldReturnFalse(){
        Basket basket = new Basket();
        String name1 = "Product1";
        int price1 = 2;
        basket.add(name1, price1);
        Assertions.assertFalse(basket.add(name1, price1));
    }

    @Test void testTotalMethod_shouldReturnInt(){
        Basket basket = new Basket();
        String name1 = "Product1";
        int price1 = 2;
        basket.add(name1, price1);
        Assertions.assertEquals(basket.total(), 2);
    }
}
