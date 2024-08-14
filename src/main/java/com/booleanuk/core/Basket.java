package com.booleanuk.core;

import java.util.HashMap;

public class Basket {

    private HashMap<String, Integer> items;

    public Basket(){
        this.items = new HashMap<>();
    }

    public boolean add(String product, int price){
        if(!items.containsKey(product)){
            this.items.put(product, price);

            return true;
        }
        return false;
    }

    public int total(){

        int total = 0;
        for (int i : this.items.values()){
            total += i;
        }
        return total;
    }



}
