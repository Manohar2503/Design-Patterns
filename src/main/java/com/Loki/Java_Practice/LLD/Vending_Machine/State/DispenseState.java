package com.Loki.Java_Practice.LLD.Vending_Machine.State;

import com.Loki.Java_Practice.LLD.Vending_Machine.Model.Coin;
import com.Loki.Java_Practice.LLD.Vending_Machine.Model.Product;
import com.Loki.Java_Practice.LLD.Vending_Machine.VendingMachine;

public class DispenseState implements State{
    private final VendingMachine machine;

    public DispenseState(
            VendingMachine machine) {

        this.machine = machine;
    }
    @Override
    public void insertCoin(Coin coin) {
        throw new IllegalStateException(
                "Dispensing in progress.");
    }

    @Override
    public void selectProduct(Product product) {
        throw new IllegalStateException(
                "Dispensing in progress.");
    }

    @Override
    public void dispense() {
        throw new IllegalStateException(
                "Already dispensing.");
    }

    @Override
    public void refind() {
        throw new IllegalStateException(
                "Cannot refund while dispensing.");
    }
}
