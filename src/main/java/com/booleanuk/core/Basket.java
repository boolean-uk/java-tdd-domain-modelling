package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String,Integer> items = new HashMap<>();

    public boolean add(String product, int price)
    {

        return !items.containsKey(product);
    }
    public int total()
    {
        int sum =0;
       for (int value: items.values())
       {
           sum+=value;
       }
       return sum;
    }
}
