package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest {
    @Test
    public void shouldInstantiateCorrectly() {
        Product product = new Product("Bread", 29, 0.0f);
        Assertions.assertEquals("Bread", product.name);
        Assertions.assertEquals(29, product.fullPriceInNOK);
        Assertions.assertEquals(0.0f, product.discount);
    }

    @Test
    public void shouldCalculatePrice() {
        Product product = new Product("Bread", 29, 0.0f);
        Assertions.assertEquals(29, product.price());
    }
}
