package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price) {
        if (this.items.get(product) == null) {
            this.items.put(product, price);
            return true;
        } else {
            return false;
        }
    }

    public int total() {
        int sum = 0;

        for(String key : this.items.keySet()) {
            sum += items.get(key);
        }
        return sum;
    }


}
