package com.Loki.Java_Practice.LLD.Vending_Machine.State;

import com.Loki.Java_Practice.LLD.Vending_Machine.Model.Coin;
import com.Loki.Java_Practice.LLD.Vending_Machine.Model.Product;
import com.Loki.Java_Practice.LLD.Vending_Machine.VendingMachine;

public class HasMoneyState implements State{
    private final VendingMachine machine;

    public HasMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin(Coin coin) {
        machine.getTransaction().insertCoins(coin);
        System.out.println("Coin inserted : " + coin);
    }

    @Override
        public void selectProduct(Product product) {
        machine.getTransaction()
                .setSelectedProduct(product);

        machine.setCurrentState(
                machine.getProductSelectedState());

    }

    @Override
    public void dispense() {
        throw new IllegalStateException(
                "Select product first.");
    }

    @Override
    public void refind() {

        System.out.println(
                "Refunding money.");

        machine.getTransaction().clear();

        machine.setCurrentState(
                machine.getIdleState());
    }
}
