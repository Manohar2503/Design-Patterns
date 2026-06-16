package com.Loki.Java_Practice.LLD.Vending_Machine.State;

import com.Loki.Java_Practice.LLD.Vending_Machine.Model.Coin;
import com.Loki.Java_Practice.LLD.Vending_Machine.Model.Product;

public interface State {
    void insertCoin(Coin coin);
    void selectProduct(Product product);
    void dispense();
    void refind();
}
