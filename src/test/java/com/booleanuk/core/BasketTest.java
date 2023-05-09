package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class BasketTest {

    @Test
    public void addTest() {
        Basket basket = new Basket();

        //Checks if the item is not in the basket
        boolean result1 = basket.add("Bananas", 10);
        Assertions.assertTrue(result1);

        //Checks if the item is already in the basket
        boolean result2 = basket.add("Bananas", 10);
        Assertions.assertFalse(result2);
    }

    @Test
    public void totalTest() {
        Basket basket = new Basket();

        //If basket is empty
        int totalPrice = 0;
        Assertions.assertEquals(totalPrice, basket.total());

        //If basket is not empty
        totalPrice = 30;
        basket.add("Bananas", 10);
        basket.add("Oranges", 20);

        Assertions.assertEquals(totalPrice, basket.total());
    }

}
