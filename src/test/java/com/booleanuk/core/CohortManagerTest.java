package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CohortManagerTest {
    @Test
    public void shouldAddProductWhenNotExists(){
        Basket basket = new Basket();
        boolean isInBasket = basket.add("aaa", 22);

        assertEquals(true, isInBasket);
    }

    @Test
    public void shouldAddProductWhenExists(){
        Basket basket = new Basket();
        basket.add("aaa", 22);
        boolean isInBasket = basket.add("aaa", 22);


        assertEquals(false, isInBasket);
    }

    @Test
    public void countTotal(){
        Basket basket = new Basket();

        basket.add("aaa", 22);
        basket.add("aba", 24);
        int total = basket.total();

        assertEquals(46, total );

    }

}
