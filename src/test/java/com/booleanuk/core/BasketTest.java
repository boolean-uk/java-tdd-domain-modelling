package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    void add() {

        Basket basket = new Basket();
        boolean check1 = basket.add("apple", 1);
        Assertions.assertTrue(check1);
        boolean check2 = basket.add("apple", 3);
        Assertions.assertFalse(check2);

    }

    @Test
    void total() {

        Basket basket = new Basket();
        basket.add("book", 3);
        basket.add("peach", 2);

        int price = basket.total();
        Assertions.assertEquals(5, price);

    }
}