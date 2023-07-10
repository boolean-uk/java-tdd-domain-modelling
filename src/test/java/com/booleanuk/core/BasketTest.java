package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    void testAdd() {

        Basket newBasket = new Basket();
        newBasket.add("Bread",2);


        Assertions.assertEquals(false, newBasket.add("Bread",2));
        Assertions.assertEquals(true, newBasket.add("Milk",3));
    }
    @Test
    void testTotal() {

        Basket newBasket = new Basket();
        newBasket.add("Bread",2);
        newBasket.add("Milk",3);

        Assertions.assertEquals(5,newBasket.total());
    }
    @Test
    public void testAddExistingItem(){
        Basket newBasket = new Basket();
        newBasket.add("Bread",2);
        boolean result = newBasket.add("Bread",5);
        Assertions.assertFalse(result);

    }
    @Test
    public void testCalculateTotalWithEmptyBasket(){
        Basket newBasket = new Basket();
        int total = newBasket.total();
        Assertions.assertEquals(0,total);

    }
    @Test
    public void testAddItemWithSameNameDiffrentPrice(){
        Basket newBasket = new Basket();
        boolean result1 = newBasket.add("Apple",10);
        boolean result2 = newBasket.add("Apple",15);
        Assertions.assertTrue(result1);
        Assertions.assertFalse(result2);



    }


}