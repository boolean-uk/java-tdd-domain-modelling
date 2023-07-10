package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    Map<String, Integer> basket;

    public Basket() {
        this.basket = new HashMap<>();
    }

    boolean add(String product, int price) {
        if (basket.containsKey(product)) {
            return false;
        }
        basket.put(product, price);
        return true;
    }

    public int total() {
        return this.basket.values().stream().mapToInt(Integer::intValue).sum();
    }


}
