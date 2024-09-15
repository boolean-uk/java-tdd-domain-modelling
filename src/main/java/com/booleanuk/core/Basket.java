package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> items;

    public Basket() {
        this.items = new HashMap<>();
    }
    public boolean addItems(String product, int price)
    {
        if (items.containsKey(product))
        {
            return false;
        } else{
            this.items.put(product,price);
            return true;
        }
    }

    public int total(){
        int result =0;
        for (String key : items.keySet()) {
            result+= items.get(key);
        }
        return result;
    }
}
