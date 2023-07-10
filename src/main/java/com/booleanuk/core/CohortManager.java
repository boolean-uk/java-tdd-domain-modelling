package com.booleanuk.core;

import java.util.HashMap;

public class CohortManager {

    private HashMap<String, Integer> list = new HashMap<>();
    private int totalPrice;
    public void add(String product, int price){
        list.put(product, price);
    }

    public int total(){
        return list.values().stream().mapToInt(d-> d).sum();
    }

    public boolean contains(String product){
        return list.containsKey(product);
    }
}
