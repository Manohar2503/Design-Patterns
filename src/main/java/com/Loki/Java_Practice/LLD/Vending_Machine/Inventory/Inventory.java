package com.Loki.Java_Practice.LLD.Vending_Machine.Inventory;

import com.Loki.Java_Practice.LLD.Vending_Machine.Model.Product;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Inventory {
    private final Map<Product, AtomicInteger> inventory;

    public Inventory() {
        inventory = new ConcurrentHashMap<>();
    }

    public void addProduct(Product product, int quantity) {

        inventory.putIfAbsent(product, new AtomicInteger());

        inventory.get(product).addAndGet(quantity);
    }

    public boolean isAvailable(Product product) {

        return inventory.containsKey(product)
                && inventory.get(product).get() > 0;
    }

    public void removeProduct(Product product) {

        if (isAvailable(product)) {
            inventory.get(product).decrementAndGet();
        }
    }

    public int getQuantity(Product product) {

        if (!inventory.containsKey(product))
            return 0;

        return inventory.get(product).get();
    }
}
