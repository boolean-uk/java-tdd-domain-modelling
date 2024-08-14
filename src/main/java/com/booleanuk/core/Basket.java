package com.booleanuk.core;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    public HashMap<String, Integer> basketList;
    public int totalCost;

    public Basket() {
        this.basketList = new HashMap<>();
        this.totalCost = 0;
    }

    public void addProduct(String product, int price) {
        basketList.put(product, price);
    }

    public int calculateTotalCostInBasket() {
        for (Map.Entry<String, Integer> entry : this.basketList.entrySet()) {
            this.totalCost += entry.getValue();
        }
        return this.totalCost;
    }
}
