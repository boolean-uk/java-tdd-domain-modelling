package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> items = new HashMap<>();

    public Basket() {
    }

    public Basket(HashMap<String, Integer> items) {
        this.items = items;
    }

    public boolean add(String product, int price) {
        if (!items.containsKey(product)) {
            items.put(product, price);
            return true;
        } else {
            return false;
        }
    }

    public int total() {
        int sum = 0;
        for (int item : items.values()) {
            sum += item;
        }
        return sum;
    }


}
