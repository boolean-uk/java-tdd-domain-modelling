package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void itemNotAlreadyInBasket() {
        Basket basket = new Basket();
        String product = "Bread";
        int price = 15;

        Assertions.assertTrue(basket.add(product,price));
    }

    @Test
    public void itemAlreadyInBasket() {
        Basket basket = new Basket();
        String product = "Milk";
        int price = 20;

        basket.add(product, price);
        Assertions.assertFalse(basket.add(product,price));
    }

    @Test
    public void basketIsEmpty() {
        Basket basket = new Basket();
        Assertions.assertEquals(0, basket.total());
    }

    @Test
    public void basketIsNotEmpty() {
        Basket basket = new Basket();
        String product = "Milk";
        int price = 20;
        basket.add(product, price);

        Assertions.assertEquals(20, basket.total());
    }
}
