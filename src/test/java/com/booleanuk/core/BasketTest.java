package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {


    @Test
    public void addingTest(){
        Basket basket = new Basket();
        boolean result1 = basket.add("Apple", 10);
        Assertions.assertTrue(result1);

    }

    @Test
    public void totalCostTest(){

    }
}
