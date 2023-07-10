package com.booleanuk.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Basket {
    Map<String, Integer> items = new HashMap<>();
    public boolean add(String item, int price){
        if(items.containsKey(item)) return false;

        items.put(item, price);
        return true;
    }

    public int total() {
        Iterator<Map.Entry<String, Integer>> iterator = items.entrySet().iterator();
        int total = 0;

        while(iterator.hasNext()){
            total += iterator.next().getValue();
        }

        return total;
    }
}
