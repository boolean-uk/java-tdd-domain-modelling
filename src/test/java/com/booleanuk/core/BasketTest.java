package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void testThatAddProductAdsProductToBasketList() {
        Basket basket = new Basket();

        int beforeAddedItem = basket.basketList.size();
        basket.addProduct("Product 1", 10);
        int afterAddedItem = basket.basketList.size();

        Assertions.assertTrue(beforeAddedItem < afterAddedItem);
    }

    @Test
    public void testCalculatingTotalCostInBasket() {
        Basket basket = new Basket();
        basket.addProduct("Product 1", 10);

        int totalCost = basket.calculateTotalCostInBasket();
        Assertions.assertEquals(10, totalCost);
    }
}
