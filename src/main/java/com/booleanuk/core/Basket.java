package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> items = new HashMap<>();
    public boolean search(String name){
       return items.containsKey(name);
    }
}
