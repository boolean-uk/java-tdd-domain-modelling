package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    void testAdd() {

        Basket newBasket = new Basket();
        newBasket.add("Bread",2);


        Assertions.assertEquals(false, newBasket.add("Bread",2));
        Assertions.assertEquals(true, newBasket.add("Milk",3));
    }
    @Test
    void testTotal() {

        Basket newBasket = new Basket();
        newBasket.add("Bread",2);
        newBasket.add("Milk",3);

        Assertions.assertEquals(5,newBasket.total());
    }
}