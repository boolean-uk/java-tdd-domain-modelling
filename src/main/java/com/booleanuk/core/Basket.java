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
}
