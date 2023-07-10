package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class BasketTest {
    Basket basket;

//    public BasketTest(){
//        this.basket = new Basket();
//        this.basket.add("t-shirt", 15);
//        this.basket.add("shorts", 20);
//    }

    @Test
    public void testAdd(){

        this.basket = new Basket();
        this.basket.add("socks", 10);
        Assertions.assertTrue(basket.add("hat", 10));
        Assertions.assertFalse(basket.add("socks", 10));
    }


    @Test
    public void testTotal(){
        this.basket = new Basket();
        this.basket.add("socks", 10);
        this.basket.add("hat", 15);
        Assertions.assertEquals(25, basket.total());
    }
}
