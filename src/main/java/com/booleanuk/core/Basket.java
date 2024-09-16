package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String,Double> item;
    public Basket() {
        this.item = new HashMap<>();
    }

    public boolean add(String product, double price) {
        if (this.item.containsKey(product.toLowerCase())) {
            return false;
        } else {
            this.item.put(product,price);
            return true;
        }
    }

    public int total() {
        return this.item.size();
    }
}
