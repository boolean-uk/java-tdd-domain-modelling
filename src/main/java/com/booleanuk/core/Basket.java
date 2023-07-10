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
    public int total() {
        int total = 0;
        // if basket is empty don't run the for loop
        if (!this.items.isEmpty()) {
            // with HashMap the index does not matter so you can use the following for loop.
//            for (int i = 0; i < this.items.size(); i++) {
//                total += this.items.get(i);
//            }
            for (Integer value : items.values()) {
                total += value;
            }
        }
        return total;
    }
}
