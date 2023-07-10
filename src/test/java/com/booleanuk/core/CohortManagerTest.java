package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CohortManagerTest {
    @Test
    public void shouldAddProductWhenNotExists(){
        Basket basket = new Basket();
        boolean isInBasket = basket.add("aaa", 22);

        assertEquals(true, isInBasket);
    }

}
