package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price) {
        boolean result = !items.containsKey(product);
        items.putIfAbsent(product, price);
        return result;
    }

    public int total() {
        return items.values().stream().mapToInt(Integer::intValue).sum();
    }
}
