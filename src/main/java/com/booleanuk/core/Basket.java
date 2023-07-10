package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    public Map<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price) {
        if (items.containsKey(product)) {
            return false;
        } else {
            items.put(product, price);
            return true;
        }
    }

    public int calculateTotalCost() {
        return items.values().stream().mapToInt(Integer::intValue).sum();
    }
}
