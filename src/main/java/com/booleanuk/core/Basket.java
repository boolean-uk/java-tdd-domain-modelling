package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> product = new HashMap<>();

    public boolean add(String name, int price) {
        if (product.containsKey(name)) {
            return false;
        } else {
            product.put(name, price);
            return true;
        }
    }

    public int total() {
        return product.entrySet().stream().reduce(0, (x, y) -> x + y.getValue(), Integer::sum);
    }
}
