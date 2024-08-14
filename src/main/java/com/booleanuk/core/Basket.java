package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    public HashMap<String, Integer> items = new HashMap<>();

    public void add(String product, int price) {
        this.items.put(product, price);
    }

    public float total() {
        int price = 0;
        for (int p : this.items.values())
            price += p;

        return price;
    }
}
