package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    void testAdd() {

        Basket newBasket = new Basket();
        newBasket.add("Sugar",2);


        Assertions.assertEquals(false,newBasket.add("Sugar",2));
        Assertions.assertEquals(true,newBasket.add("Coffee",5));
    }
    @Test
    void testTotal() {

        Basket newBasket = new Basket();
        newBasket.add("Sugar",2);
        newBasket.add("Coffee",5);
       // newBasket.total();

        Assertions.assertEquals(7,newBasket.total());
//        Assertions.assertEquals(true,newBasket.add("Coffee",5));
    }
}