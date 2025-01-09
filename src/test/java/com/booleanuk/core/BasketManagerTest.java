package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketManagerTest {
    @Test
    public void searchForProductThatExists(){
        //setup
        BasketManager basketManager = new BasketManager();
        String product = "Butter";
        int price = 50;
        // Execute and Verify
        Assertions.assertTrue(basketManager.add(product, price));

    }

    @Test
    public void searchProductThatDoesNotExists(){
        //setup
        BasketManager basketManager = new BasketManager();
        String product = "Salt";
        int price = 10;
        // Execute and Verify
        Assertions.assertFalse(basketManager.add(product, price));

    }

    @Test
    public void TestTotal(){
        //setup
        BasketManager basketManager = new BasketManager();
        //Execute and Verify
        Assertions.assertEquals(210, basketManager.total());
    }
}
