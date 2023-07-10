package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final Map<String, Integer> items;

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

    Map<String, Integer> getItems() {
        return items;
    }

    int total() {
        return items.values().stream().reduce(0, Integer::sum);
    }
}
