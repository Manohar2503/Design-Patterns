package com.Loki.Java_Practice.LLD.Vending_Machine.State;

import com.Loki.Java_Practice.LLD.Vending_Machine.Model.Coin;
import com.Loki.Java_Practice.LLD.Vending_Machine.Model.Product;
import com.Loki.Java_Practice.LLD.Vending_Machine.VendingMachine;

public class IdleState implements State{

    private final VendingMachine machine;

    public IdleState(VendingMachine machine) {
        this.machine = machine;
    }
    @Override
    public void insertCoin(Coin coin) {
        machine.getTransaction().insertCoins(coin);

        System.out.println("Coin inserted : " + coin);

        machine.setCurrentState(machine.getHasMoneyState());
    }

    @Override
    public void selectProduct(Product product) {
        throw new IllegalStateException(
                "Insert money first.");
    }

    @Override
    public void dispense() {
        throw new IllegalStateException(
                "Insert money first.");
    }

    @Override
    public void refind() {
        throw new IllegalStateException(
                "Insert money first.");
    }
}
