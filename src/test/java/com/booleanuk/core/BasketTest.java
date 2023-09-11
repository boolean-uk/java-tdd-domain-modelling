package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    public void shouldReturnFalse(){
        Basket cart = new Basket();
        Assertions.assertFalse(cart.add("tomato", 1));
    }

    @Test
    public void shouldReturnTrue(){
        Basket cart = new Basket();
        cart.add("tomato", 1);
        Assertions.assertTrue(cart.add("tomato",2));
    }

    @Test
    public void shouldCalculateCorrectTotal(){
        Basket cart = new Basket();
        cart.add("tomato", 1);
        cart.add("potato", 2);
        cart.add("apple", 1);
        cart.add("watermelon", 3);
        cart.add("bananas", 2);
        Assertions.assertEquals(9, cart.total());
    }
}
