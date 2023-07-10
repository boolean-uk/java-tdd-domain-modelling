package com.booleanuk.core;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BasketTest
{

    @Test
    public void itemWithTheProvidedNameIsAlreadyInTheBasketShouldReturnFalse(){
        // when
        Basket basket = new Basket();
        basket.items.put("tomato", 2);
        basket.items.put("potato", 1);
        //given
        boolean isInTheBasket = basket.add("tomato", 2);

        //then
        assertFalse(isInTheBasket);
    }

    @Test
    public void itemWithTheProvidedNameIsAlreadyInTheBasketShouldReturnTrue() {
        // when
        Basket basket = new Basket();
        basket.items.put("tomato", 2);
        basket.items.put("potato", 1);
        //given
        boolean isInTheBasket = basket.add("Mango", 5);

        //then
        assertTrue(isInTheBasket);
    }

    @Test
    public void shouldReturnTotalCostOfBasket(){
        //when
        Basket basket = new Basket();
        basket.items.put("tomato", 2);
        basket.items.put("potato", 1);
        Basket basket1 = new Basket();
        basket1.items.put("apple", 1);
        basket1.items.put("blueberry", 6);
        basket1.items.put("peach", 3);
        basket1.items.put("potato", 1);
        //given
        int total = basket.total();
        int totalBasket1 = basket1.total();
        //then
        assertEquals(3, total);
        assertEquals(11, totalBasket1);
    }

}
