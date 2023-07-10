package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.beancontext.BeanContextServiceAvailableEvent;
import java.util.HashMap;

public class BasketTest {
    private Basket basket;

    //add(String product, int price)
    @Test
    public void testAddReturnsFalse(){
        HashMap<String, Integer> items = new HashMap<>();
        items.put("Milk",2);
        Assertions.assertFalse(basket.add("Milk",2));
    }

    @Test
    public void testAddReturnsTrue(){
        HashMap<String, Integer> items = new HashMap<>();
        items.put("Juice",3);
        items.put("Milk",2);
        Assertions.assertFalse(basket.add("Orange",2));
    }

    @Test
    public void testTotal(){
        HashMap<String, Integer> items = new HashMap<>();
        items.put("Juice",3);
        items.put("Milk",2);
        Assertions.assertEquals(5, basket.total());
    }






}
