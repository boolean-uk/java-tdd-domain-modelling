package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CohortManagerTest {
    @Test
    public void whenItemIsNotInTheBasketShouldReturnTrue(){
        Basket basket = new Basket();
        String product = "Milk";
        int price = 14;

        boolean result = basket.add(product, price);

        Assertions.assertTrue(result);
    }
}
