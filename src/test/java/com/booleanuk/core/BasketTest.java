package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    void checkItemInTheBasket() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("sugar",2.4d));
        Assertions.assertTrue(basket.add("milk",1.4d));
        Assertions.assertTrue(basket.add("eggs",1.3d));

        Assertions.assertFalse(basket.add("Sugar",2.4d));
        Assertions.assertFalse(basket.add("Milk",2.3d));

        Assertions.assertEquals(basket.total(),3);

        Assertions.assertTrue(basket.add("cereals", 1.4d));
        Assertions.assertEquals(basket.total(),4);
    }
}
