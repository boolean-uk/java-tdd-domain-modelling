package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    public void shouldReturnFalse() {
        Basket basket = new Basket();
        boolean result = basket.add("apple", 3);
        Assertions.assertFalse(result);
    }
}
