package com.booleanuk.core;

public class Product {
    public String name;
    public int fullPriceInNOK;
    public float discount; // 0..1, 0 means no discount 1 means 100%

    public Product(String name, int fullPriceInNOK, float discount) {
        this.name = name;
        this.fullPriceInNOK = fullPriceInNOK;
        this.discount = discount;
    }

    public float price() {
        return this.fullPriceInNOK * (1 - discount);
    }
}
