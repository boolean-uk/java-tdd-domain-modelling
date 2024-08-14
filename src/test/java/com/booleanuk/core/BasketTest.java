package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void testBasketExist() {
        Basket basket = new Basket();
        String product = "Cucumber";
        int price = 399;

        Assertions.assertTrue(basket.add(product, price));
    }

    @Test
    public void testBasketAddItem() {
        Basket basket = new Basket();
        String product = "Cucumber";
        int price = 399;

        Assertions.assertTrue(basket.add(product, price));
        Assertions.assertFalse(basket.add(product, price));
    }

    @Test
    public void testTotalExist(){
        Basket basket = new Basket();

        Assertions.assertEquals(0, basket.total());
    }

    @Test
    public void testTotalValueOfBasketOneItem(){
        Basket basket = new Basket();
        String product = "Cucumber";
        int price = 399;
        basket.add(product, price);

        Assertions.assertEquals(399, basket.total());
    }

    @Test
    public void testTotalValueOfBasketManyItems(){
        Basket basket = new Basket();
        basket.add("Cucumber", 10);
        basket.add("Tomato", 20);
        basket.add("Coffee", 30);
        basket.add("Red bull", 40);

        Assertions.assertEquals(100, basket.total());
    }

}
