package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addToBasketReturnsTrue()
    {   Basket basket = new Basket();
        String product = "Produkt";
        int price = 123;
        boolean result = basket.add(product, price);
        Assertions.assertTrue(result);
    }
    @Test
    public void addToBasketReturnsFalse()
    {   Basket basket = new Basket();
        String product = "Produkt";
        int price = 123;
        basket.items.put(product,price);
        boolean result = basket.add(product, price);
        Assertions.assertFalse(result);
    }
    @Test
    public void totalReturnsint()
    {
        Basket basket = new Basket();
        Assertions.assertEquals(0,basket.total());
    }
    @Test
    public void totalReturns123()
    {
        Basket basket = new Basket();
        String product = "Produkt";
        int price = 123;
        basket.items.put(product,price);
        Assertions.assertEquals(123,basket.total());
    }

}