package com.Loki.Java_Practice.LLD.Vending_Machine.Model;

public class Product {
    private final int productId;
    private final String productName;
    private final int price;

    public Product(int pid, String name, int price){
        this.productId = pid;
        this.productName=name;
        this.price=price;
    }

    public int getId() {
        return productId;
    }


    public int getPrice() {
        return price;
    }
    public String getName(){
        return productName;
    }

    @Override
    public String toString() {
        return productName + " : " + price;
    }

}
