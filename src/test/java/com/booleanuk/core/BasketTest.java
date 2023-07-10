package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class BasketTest {

    Basket basket;

    public BasketTest() {
        this.basket = new Basket();
    }

    @Test
    public void providedNameShouldReturnTrue() {
        Map<String, Integer> itemMap = new HashMap<>();
        itemMap.put("Coffee", 4);
        itemMap.put("Tea", 3);
        Assertions.assertTrue(basket.add("Coffee",4));
        Assertions.assertFalse(basket.add("Coffee",4));
    }




    @Test
    public void checkTotalPriceEquals7() {

        basket.add("Coffee", 4);
        basket.add("Tea", 3);



        Assertions.assertEquals(7, basket.total());
    }



}
