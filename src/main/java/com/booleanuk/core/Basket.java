package com.booleanuk.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Basket {
    HashMap <String, Double> items = new HashMap<String, Double>();
    public boolean add(String product, double price){
        if(items.get(product) == null){
            items.put(product,price);
            return true;
        }
        return false;
    }
    public double total(){
        double total = 0.0;
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            total += entry.getValue();
        }
        return total;
    }
}
