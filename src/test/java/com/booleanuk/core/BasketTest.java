package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    public Basket getTestBasket(){
        return new Basket();
    }


    @Test
    public void testBasketConstructor(){
        Basket basket = getTestBasket();
    }

    @Test
    void testadd(){
        Basket basket = getTestBasket();
        basket.add("Banana", 10);
        basket.add("Coca Cola", 20);
        Assertions.assertTrue(basket.items.containsKey("Banana"));
        Assertions.assertTrue(basket.items.containsKey("Coca Cola"));
        Assertions.assertFalse(basket.items.containsKey("Unknown item"));
    }

    @Test
    void testTotal(){
        Basket basket = getTestBasket();
        basket.add("Banana", 10);
        basket.add("Coca Cola", 20);

        Assertions.assertEquals(basket.total(), 30);

        Assertions.assertNotEquals(basket.total(), 45); // should not be 45 yet
        basket.add("kaptein sabeltann is", 15);
        Assertions.assertEquals(basket.total(), 45); // should now be 45

    }
}
