package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    public HashMap<String, Integer> items = new HashMap<>();


    public boolean add(String product, int price){
        if (items.containsKey(product)){
            return false;
        }
        items.put(product,price);
        return true;
    }
}
