package com.booleanuk.core;

import java.util.HashMap;

public class BasketManager {
    private HashMap<String, Integer> items = new HashMap<>();

    public BasketManager(){
        items.put("Butter", 50);
        items.put("Hotdogs", 60);
        items.put("Cheese", 100);
    }

    public boolean add(String product, int price){
        return items.containsKey(product);
    }

    public int total(){
        int totalSum = 0;
        for (var entry : items.entrySet()){
            totalSum += entry.getValue();
        }
        return totalSum;
    }
}
