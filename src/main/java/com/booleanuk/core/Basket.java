package com.booleanuk.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Basket {
    HashMap <String, Double> items = new HashMap<String, Double>();
    public boolean add(String product, double price){
        if(!items.containsKey(product)){
            items.put(product,price);
            return true;
        }
        return false;
    }
    public double total(){
        double total = 0.0;
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            double price = entry.getValue();

            if (price < 0)
                price = 0;

            total += price;
        }
        if(total < 0.0){
            return 0.0;
        }else{
            return total;
        }
    }
}
