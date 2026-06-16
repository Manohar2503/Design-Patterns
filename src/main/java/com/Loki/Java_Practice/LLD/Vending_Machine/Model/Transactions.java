package com.Loki.Java_Practice.LLD.Vending_Machine.Model;

import java.util.ArrayList;
import java.util.List;

public class Transactions {
    private Product selectedProduct;

    private List<Coin> insertedCoins;

    public Transactions(){
        insertedCoins = new ArrayList<>();
    }

    public void setSelectedProduct(Product product){
        this.selectedProduct=product;
    }

    public void insertCoins(Coin coin){
        insertedCoins.add(coin);
    }

    public List<Coin> getInsertedCoins(){
        return insertedCoins;
    }
    public Product getSelectedProduct(){
        return selectedProduct;
    }
    public int getTotalAmount(){
        int total =0;
        for(Coin coin: insertedCoins){
            total += coin.getValue();
        }
        return total;
    }
    public void clear(){
        insertedCoins.clear();
        selectedProduct=null;
    }
}
