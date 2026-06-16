package com.Loki.Java_Practice.LLD.Vending_Machine.State;

import com.Loki.Java_Practice.LLD.Vending_Machine.Model.Coin;
import com.Loki.Java_Practice.LLD.Vending_Machine.Model.Product;
import com.Loki.Java_Practice.LLD.Vending_Machine.VendingMachine;

public class ProductSelectedState implements State{
    private final VendingMachine machine;

    public ProductSelectedState(
            VendingMachine machine) {

        this.machine = machine;
    }
    @Override
    public void insertCoin(Coin coin) {
        machine.getTransaction().insertCoins(coin);
    }

    @Override
    public void selectProduct(Product product) {
        throw new IllegalStateException(
                "Product already selected.");
    }

    @Override
    public void dispense() {
        machine.setCurrentState(
                machine.getDispenseState());

        machine.dispenseProduct();
    }

    @Override
    public void refind() {
        machine.getTransaction().clear();

        machine.setCurrentState(
                machine.getIdleState());
    }
}
