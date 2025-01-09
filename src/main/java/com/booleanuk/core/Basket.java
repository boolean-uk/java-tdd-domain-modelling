package com.booleanuk.core;

import java.util.HashMap;

public class Basket {

    HashMap<String, Integer> items = new HashMap<>();
    int total = 0;

    public boolean add(String product, int price) {
        if (!items.containsKey(product)) {
            items.put(product, price);
            return true;
        }
        return false;
    }

    public int total() {
        for (String key : items.keySet()) {
            total += items.get(key);
        }
        return this.total;
    }
}
