package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void testReturnTrueIfProductIsNotInBasket(){
        // creates new Basket instance called basket (of Basket class)
        Basket basket = new Basket();
        // adds key-value pair to items hashmap of basket
        basket.items.put("Milk", 2);
        // call add method on basket which checks if "Eggs" is not in hashMap
        Assertions.assertTrue(basket.add("Eggs", 3));
    }

    @Test
    public void testReturnFalseIfProductIsAlreadyInBasket() {
        Basket basket = new Basket();
        basket.items.put("Milk", 2);
        Assertions.assertFalse(basket.add("Milk", 5));
    }

    @Test
    public void testAddMethodIfProductIsAdded(){
        Basket basket = new Basket();
        basket.add("Bread", 2);
        Assertions.assertTrue(basket.items.containsKey("Bread"));
    }
}
