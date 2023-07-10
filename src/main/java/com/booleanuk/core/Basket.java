package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price){
        if(items.containsKey(product)){
            return false;
        }else{
            items.put(product, price);
            return true;
        }
    }

    public int total(){
        int total = 0;
        for(Map.Entry<String, Integer> entry : items.entrySet()){
            total+= entry.getValue();
        }
        return total;
    }
}
