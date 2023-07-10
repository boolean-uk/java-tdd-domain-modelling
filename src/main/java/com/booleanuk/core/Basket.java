package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    Map<String, Integer> basket = new HashMap<>();

    public Basket() {
        basket.put("Coffee" ,4);
    }

    public boolean add(String name, int price) {
        return basket.containsKey(name);
    }

}
