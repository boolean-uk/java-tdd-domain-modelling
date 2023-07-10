package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String,Integer> items = new HashMap<>();

    public boolean add(String product, int price)
    {
        boolean isInBasket = items.containsKey(product);
        if(!isInBasket)
        {
            items.put(product,price);
        }
        return  !isInBasket;
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
