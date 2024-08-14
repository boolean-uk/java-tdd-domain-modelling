package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class BasketTest {
    HashMap<String, Integer> map;

    public BasketTest(){
        map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Orange", 5);
    }

    @Test
    public void addTest(){
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("Pear", 15));
    }

    @Test
    public void totalTest(){
        Basket basket = new Basket();
        Assertions.assertEquals(15, basket.total());
        //tests
    }


}
