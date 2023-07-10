package com.booleanuk.core;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest
{

    @Test
    public void itemWithTheProvidedNameIsAlreadyInTheBasketShouldReturnFalse(){
        // when
        Basket basket = new Basket();
        basket.items.put("tomato",2);
        basket.items.put("potato",1);
        //given
        boolean isInTheBasket = basket.add("tomato",2);

        //then
        Assertions.assertFalse(isInTheBasket);
    }

}
