package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> products = new HashMap<>();

    public boolean add(String product, int price) {
        if(!products.containsKey(product)) {
            products.put(product, price);
            return true;
        }
        return false;
    }
}
