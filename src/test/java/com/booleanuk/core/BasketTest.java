package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void itemIsNotAlreadyInBasket() {
        Basket basket = new Basket();
        basket.items.put("Apple", 1);
        basket.items.put("Banana", 20);
        Assertions.assertTrue(basket.add("TestItem1", 1));
    }

    @Test
    public void itemIsAlreadyInBasket() {
        Basket basket = new Basket();
        basket.items.put("Apple", 1);
        basket.items.put("Banana", 20);
        basket.items.put("TestItem2", 1);
        Assertions.assertFalse(basket.add("TestItem2", 1));
    }

    @Test
    public void totalShouldBeZero() {
        Basket basket = new Basket() {};
        Assertions.assertEquals(0, basket.total());
    }

    @Test
    public void totalShouldIncrease() {
        Basket basket = new Basket() {};
        basket.add("Banana", 20);
        Assertions.assertEquals(20, basket.total());
    }

}
