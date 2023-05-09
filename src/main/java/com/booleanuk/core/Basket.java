package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> items;

    // constructor for Basket
    public Basket() {
        // creates new Hashmap for items
        this.items = new HashMap<>();
    }

    public boolean add(String product, int price){
        // check if product is not in items hashmap
        if (!this.items.containsKey(product)) {
            // add product to items hashmap
            this.items.put(product, price);
            return true;
        }
        // return false if product is already in items hashmap
        return false;
    }
}
