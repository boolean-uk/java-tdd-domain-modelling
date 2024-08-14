package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    HashMap<String, Integer> map;

    public Basket(){
        map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Orange", 5);
    }

    public Boolean add(String item, int price){
        if (map.containsKey(item)){
            return false;
        }else{
            map.put(item, price);
            return true;
        }
    }

    public int total(){
        int total = 0;
        for (Map.Entry<String, Integer> set : map.entrySet()){
            total += set.getValue();
        }
        return total;
    }
}
