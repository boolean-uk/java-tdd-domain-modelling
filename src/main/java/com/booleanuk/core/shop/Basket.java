package com.booleanuk.core.shop;

import java.math.BigDecimal;
import java.util.*;


public class Basket {
    private final Set<Product> products = new HashSet<>();

    public BigDecimal totalCost() {
        return products.stream()
                .map(Product::price)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public Receipt receipt() {
        Map<Product, Integer> products = new HashMap<>();
        var totalPrice = BigDecimal.ZERO;
        for (var p : this.products) {
            products.merge(p, 1, Integer::sum);
            totalPrice = totalPrice.add(p.price());
        }

        return new Receipt(products, totalPrice);
    }

    public boolean addProduct(Product product){
        if (products.contains(product)) {
            return true;
        }
        products.add(product);
        return false;
    }

    public void removeProduct(String name) {
        var toRemove = products.stream()
                .filter(p -> p.name().equals(name))
                .toList();

        toRemove.forEach(products::remove);
    }

    public void clear() {
        products.clear();
    }
}
