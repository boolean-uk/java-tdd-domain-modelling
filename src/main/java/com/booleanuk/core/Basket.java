package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> items;

    public Basket() {
        items = new HashMap<>();
    }

    public boolean add(String product, int price) {
        var isAdded = items.putIfAbsent(product, price);
        return isAdded == null;
    }

    public int total() {
        int total = items.values().stream().reduce(0, Integer::sum);
        return total;
    }
}
