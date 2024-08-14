package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    HashMap<String, Integer> items = new HashMap<>();

    public Boolean add(String product, int price){
        if (!items.isEmpty() && items.containsKey(product)){
            return false;
        } else {
            items.put(product, price);
            return true;
        }
    }

    public Integer total(){
        int total = 0;
        if (items.isEmpty()){
            return 0;
        }else {
            for (Map.Entry<String, Integer> set : items.entrySet()){
                total+=set.getValue();
            }
        }
        return total;
    }
}
