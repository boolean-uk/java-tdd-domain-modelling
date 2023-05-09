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


}
