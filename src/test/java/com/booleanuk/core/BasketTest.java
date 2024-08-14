package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void testAddExists(){
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("string", 1));
    }

    @Test
    public void testAddActuallyAdds(){
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("productOne", 5));
        Assertions.assertFalse(basket.add("productOne", 5));
    }

    @Test
    public void testTotalExists(){
        Basket basket = new Basket();
        Assertions.assertEquals(0, basket.total());
    }

    @Test
    public void testTotalFunction(){
        Basket basket = new Basket();
        basket.add("productOne", 5);
        basket.add("productTwon", 4);
        Assertions.assertEquals(9, basket.total());
    }

}
