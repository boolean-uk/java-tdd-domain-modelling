package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    public HashMap<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price) {
        if (items.containsKey(product)) {
            return false;
        }
        items.put(product, price);
        return true;
    }

    public int total() {
        int sum = 0;
        for (int price : items.values()) {
            sum += price;
        }
        return sum;
    }

//    public static void main(String[] args ){
//        Basket basket = new Basket();
//        for (String i: basket.items.keySet()
//        ) {
//            System.out.println(i);
//        }
//    }
}
