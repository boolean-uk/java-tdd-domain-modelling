package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    HashMap<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price){

        if (items.containsKey(product))
            return false;

        items.put(product, price);
        return true;
    }

    public int total(){
        int sum = 0;

        for (Map.Entry<String, Integer> item : items.entrySet()) {
            sum += item.getValue();
        }
        return sum;
    }

}