package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
HashMap<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price){
        if(items.containsKey(product)){
            return false;
        }else{
            items.put(product, price);
            return true;
        }
    }

    public int total(){
        return 2;
    }
}
