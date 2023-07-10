package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    private HashMap<String, Integer> items;

    public Basket() {
        this.items = new HashMap<>();
    }

    public boolean add(String product, int price){
        boolean wasInBasket = this.items.containsKey(product);
        if (wasInBasket){
            return false;
        }else{
            this.items.put(product, price);
            return true;
        }
    }

    public int total(){
        return this.items.values().stream().mapToInt(Integer::intValue).sum();
    }
}
