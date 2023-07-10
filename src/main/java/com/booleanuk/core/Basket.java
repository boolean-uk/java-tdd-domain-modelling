package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    private final HashMap<String, Integer> items;

    public Basket() {
        this.items = new HashMap<>();
    }

    boolean add(String product, int price) {
        if (items.containsKey(product)) {
            return false;
        }
        items.put(product, price);
        return true;
    }

    int total() {
        return items.values().stream().reduce(0, Integer::sum);
    }
}
