package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    HashMap<String,Integer> items;

    public Basket(){
        this.items = new HashMap<>();
    }

    public boolean add (String product, int price){
        boolean flag = this.items.containsKey(product);
        this.items.put(product,price);
        return flag;
    }

    public int total(){
        int sum = 0;
        for (Map.Entry<String,Integer> set: this.items.entrySet()) {
            sum += set.getValue();
        }
        return sum;
    }
}
