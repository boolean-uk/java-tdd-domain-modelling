package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class BasketTest {


    @Test
    public void testItemInBasket(){
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("new", 40));
        Assertions.assertFalse(basket.add("new", 30));
    }

    @Test
    public void testTotal(){
        Basket basket = new Basket();
        Assertions.assertEquals(0, basket.total());

        basket.add("new", 30);
        basket.add("new2", 30);
        Assertions.assertEquals(60, basket.total());
    }
}
