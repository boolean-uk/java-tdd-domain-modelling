package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
   public HashMap<String, Integer> items;

    public Basket() {
        this.items = new HashMap<String, Integer>();
    }

    public boolean add(String product, int price) {
        return price >= 0 && product.strip().length() != 0
                && this.items.putIfAbsent(product, price) == null;
    }

    public int total() {
        return this.items.values()
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

    }
}
