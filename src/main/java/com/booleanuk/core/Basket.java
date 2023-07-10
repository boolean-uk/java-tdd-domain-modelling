package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    private static HashMap<String, Integer> items;

    public Basket() {
        items = new HashMap<>();
    }
    public void add(String product, int price) {
        items.put(product, price);
    }

    public int total(){
        return items.values().stream().mapToInt(Integer::intValue).sum();
    }

    public boolean search(String name){
       return items.containsKey(name);
    }

}
