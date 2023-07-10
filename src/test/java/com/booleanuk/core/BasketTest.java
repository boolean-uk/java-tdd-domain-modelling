package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.beancontext.BeanContextServiceAvailableEvent;
import java.util.HashMap;

public class BasketTest {
    private Basket basket;

    @BeforeEach
    void setBasket(){
        basket = new Basket();
    }
    @Test
    public void testAddReturnsFalse(){
        //HashMap<String, Integer> items = new HashMap<>();
        basket.items.put("Milk",2);
        boolean result = basket.add("Milk",2);
        Assertions.assertFalse(result);
    }

    @Test
    public void testAddReturnsFalse2(){
        //HashMap<String, Integer> items = new HashMap<>();
        basket.items.put("Flour",2);
        boolean result = basket.add("Flour",2);
        Assertions.assertFalse(result);
    }

    @Test
    public void testAddReturnsTrue(){
        //HashMap<String, Integer> items = new HashMap<>();
        basket.items.put("Juice",3);
        basket.items.put("Milk",2);
        Assertions.assertTrue(basket.add("Orange",2));
    }

    @Test
    public void testTotal(){
       // HashMap<String, Integer> items = new HashMap<>();
       // items.put("Juice",3);
       // items.put("Milk",2);
        basket.items.put("Milk",2);
        basket.items.put("Juice",3);
        Assertions.assertEquals(5, basket.total());
    }






}
