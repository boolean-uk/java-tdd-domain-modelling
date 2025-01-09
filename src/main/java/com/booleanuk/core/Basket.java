package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    Map<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price) {
        if (this.items.containsKey(product)) {
            return false;
        }

        this.items.put(product, price);
        return true;
    }

    public int total() {
        int total = 0;
        for (int price : this.items.values()) {
            total += price;
        }
        return total;
    }
}
