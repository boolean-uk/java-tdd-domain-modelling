package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CohortManagerTest {
    @Test
    public void testAdd() {
        Basket basket = new Basket();
        // add something
        boolean resultShouldBeTrue = basket.add("Feta", 14.5);

        Assertions.assertTrue(resultShouldBeTrue);
        // add some something
        boolean resultShouldBeFalse = basket.add("Feta", 14.5);

        Assertions.assertFalse(resultShouldBeFalse);
    }

    @Test
    public void testTotal() {
        Basket basket = new Basket();
        // add something
        boolean result1 = basket.add("Feta", 14.5);
        boolean result2 = basket.add("Feta", 14.5);
        boolean result3 = basket.add("Elies", 7.2);
        boolean result4 = basket.add("Makaronia", -1.2);

        Assertions.assertEquals(21.7, basket.total());
    }
}
