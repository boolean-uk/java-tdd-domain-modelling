package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    private final HashMap<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price) {
        if (product.isEmpty() || items.containsKey(product)) {
            return false;
        }
        items.put(product, price);
        return true;
    }

    public int total() {
        int total = 0;

        for (int price : items.values()) {
            total += price;
        }
        return total;
    }
}