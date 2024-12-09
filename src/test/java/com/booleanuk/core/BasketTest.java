package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void addShouldBeTrue() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("Oranges", 3));
    }

    @Test
    public void addShouldBeFalse() {
        Basket basket = new Basket();
        basket.add("Oranges",2);
        Assertions.assertFalse(basket.add("Oranges", 3));
    }

    @Test
    public void totalShouldBe0() {
        Basket basket = new Basket();
        Assertions.assertEquals(basket.total(), 0);
    }

    @Test
    public void totalShouldBe10() {
        Basket basket = new Basket();
        basket.add("Cheese", 10);
        Assertions.assertEquals(basket.total(), 10);
    }

    @Test
    public void totalShouldBe15() {
        Basket basket = new Basket();
        basket.add("Cheese", 10);
        basket.add("Bread", 5);
        Assertions.assertEquals(basket.total(), 15);
    }

}
