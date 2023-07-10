package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    private final HashMap<String, Integer> basket = new HashMap<>();

    public boolean add(String product, int price) {
        if (basket.containsKey(product))
            return false;
        basket.put(product, price);
        return true;
    }

    public int total() {
        int sum = 0;
        for (int price : basket.values())
            sum += price;
        return sum;
    }
}
