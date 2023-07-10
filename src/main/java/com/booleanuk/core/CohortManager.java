package com.booleanuk.core;

import java.util.HashMap;

public class CohortManager {

    private final HashMap<String, Integer> productsPrice = new HashMap<String, Integer>();
    private int totalPrice;
    public void add(String product, int price){
        productsPrice.put(product, price);
    }

    public int total(){
        return productsPrice.values().stream().mapToInt(d-> d).sum();
    }

    public boolean contains(String product){
        return productsPrice.containsKey(product);
    }
}