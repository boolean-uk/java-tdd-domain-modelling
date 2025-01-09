package com.booleanuk.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BasketTest {
    @Test
    public void canAddNewItem() {
        Basket basket = new Basket();
        String product = "eggs";
        int price = 20;
        Assertions.assertTrue(basket.add(product, price));
    }

    @Test
    public void cannotAddExistingItem() {
        Basket basket = new Basket();
        String product = "eggs";
        int price = 20;
        basket.add(product, price);
        Assertions.assertFalse(basket.add(product, price));
    }

    @Test
    public void emptyBasketShouldHaveZeroTotal() {
        Basket basket = new Basket();
        Assertions.assertEquals(0, basket.total());
    }

    @Test
    public void correctCostOfSingleItem() {
        Basket basket = new Basket();
        String product = "eggs";
        int price = 20;
        basket.add(product, price);
        Assertions.assertEquals(price, basket.total());
    }

    @Test
    public void correctCostOfSeveralItems() {
        Basket basket = new Basket();
        String prod1 = "eggs";
        String prod2 = "milk";
        String prod3 = "flour";
        int price1 = 20;
        int price2 = 22;
        int price3 = 17;
        basket.add(prod1, price1);
        basket.add(prod2, price2);
        basket.add(prod3, price3);
        Assertions.assertEquals(59, basket.total());
    }

    @Test
    public void addingExistingItemShouldNotIncreaseTotal() {
        Basket basket = new Basket();
        String product = "eggs";
        int price = 20;
        basket.add(product, price);
        basket.add(product, price);
        Assertions.assertEquals(20, basket.total());
    }
}
