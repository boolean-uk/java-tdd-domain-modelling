package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    public void whenItemIsNotInTheBasketShouldReturnTrue(){
        Basket basket = new Basket();
        String product = "Milk";
        int price = 14;

        boolean result = basket.add(product, price);

        Assertions.assertTrue(result);
    }

    @Test
    public void whenItemIsInTheBasketShouldReturnFalse(){
        Basket basket = new Basket();
        String product = "Milk";
        int price = 14;

        basket.add(product, price);

        boolean result = basket.add(product, price);

        Assertions.assertFalse(result);
    }

    @Test
    public void returnTotalPriceOfItems(){
        Basket basket = new Basket();

        String product1 = "Milk";
        int price1 = 14;
        basket.add(product1, price1);

        String product2 = "Butter";
        int price2 = 36;
        basket.add(product2, price2);

        int result = basket.total();

        Assertions.assertEquals(result, 50);
    }
}
