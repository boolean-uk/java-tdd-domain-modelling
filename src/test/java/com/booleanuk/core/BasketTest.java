package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddProductToBasket() {
        Basket basket = new Basket();
        basket.add("Bread", 29);
        Assertions.assertEquals(1, basket.items.size());
    }

    @Test
    public void testCalculateTotal() {
        Basket basket = new Basket();
        basket.add("Bread", 29);
        basket.add("Soda", 20);

        Assertions.assertEquals(2, basket.items.size());
        Assertions.assertEquals(29 + 20, basket.total());

        basket.add("Milk", 25);
    }

}
