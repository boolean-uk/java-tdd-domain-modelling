package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    public HashMap<String, Integer> basket = new HashMap<>();

    public boolean add(String product, Integer price) {
        boolean alreadyExists = false;
        if (!basket.containsKey(product)) {
            basket.put(product, price);
            alreadyExists = true;
        }
        return alreadyExists;
    }

    public int total() {
        int total = 0;
        for (Map.Entry<String, Integer> entry : basket.entrySet()) {
            int num = entry.getValue();
            total += num;
        }
        return total;
    }

}
