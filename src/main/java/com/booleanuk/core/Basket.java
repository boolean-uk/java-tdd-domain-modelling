package com.booleanuk.core;

import java.util.Arrays;
import java.util.HashMap;

public class Basket {

    HashMap<String, Integer> items=new HashMap<>();

    boolean add(String product, int price) {
        if (items.containsKey(product)) {
            items.put(product, price);
            return false;
        }
        items.put(product, price);
        return true;
    }
    int total(){
        int sum = 0;
        for (Integer value : items.values()) {
            sum +=value;
        }
        return sum;
    }
}
