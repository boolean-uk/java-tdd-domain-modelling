package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price) {
        return items.put(product, price) == null;
    }

    public int total() {
        int totalCost = 0;
        for(String key : items.keySet()) {
            totalCost += items.get(key);
        }
        return totalCost;
    }
}
