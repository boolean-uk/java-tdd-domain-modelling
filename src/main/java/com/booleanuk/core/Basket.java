package com.booleanuk.core;

import java.util.HashMap;

public class Basket {

    HashMap<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price){
        if(items.containsKey(product)){
            return false;
        }
        items.put(product, price);
        return true;
    }

    public int total(){
        int result = 0;
        for(int price : items.values()){
            result += price;
        }
        return result;
    }
}
