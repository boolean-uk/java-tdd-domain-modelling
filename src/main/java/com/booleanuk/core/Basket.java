package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    HashMap<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price){
       // System.out.println(this.items.put(product,price));
        return this.items.put(product,price)==null;
    }
    public int total(){
        int total =0;
        for (Map.Entry<String, Integer> entry : this.items.entrySet()) {

            total += entry.getValue();

        }

        return total;
    }
}
