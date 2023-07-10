package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    Map<String, Integer> items = new HashMap<>();
    public boolean add(String item, int price){
        if(items.containsKey(item)) return false;

        items.put(item, price);
        return true;
    }
}
