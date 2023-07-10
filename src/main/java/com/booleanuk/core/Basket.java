package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    Map<String, Integer> basket = new HashMap<>();

    public Basket() {
        basket.put("Coffee" ,4);
        basket.put("Tea", 3);
    }

    public boolean add(String name, int price) {
        return basket.containsKey(name);
    }

    public int total() {
        int totalPrice = 0;
        for(int price : basket.values()) {
            totalPrice += price;
        }
        return totalPrice;
    }


}
