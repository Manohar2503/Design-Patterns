package com.Loki.Java_Practice.LLD.Vending_Machine;

import com.Loki.Java_Practice.LLD.Vending_Machine.Inventory.Inventory;
import com.Loki.Java_Practice.LLD.Vending_Machine.Model.Coin;
import com.Loki.Java_Practice.LLD.Vending_Machine.Model.Product;
import com.Loki.Java_Practice.LLD.Vending_Machine.Model.Transactions;
import com.Loki.Java_Practice.LLD.Vending_Machine.State.*;

import java.util.concurrent.locks.ReentrantLock;

public class VendingMachine {
    private final Inventory inventory;
    private final Transactions transaction;

    // State Pattern
    private State currentState;
    private final IdleState idleState;
    private final HasMoneyState hasMoneyState;
    private final ProductSelectedState productSelectedState;
    private final DispenseState dispenseState;

    // Concurrency
    private final ReentrantLock lock;
    public VendingMachine() {

        inventory = new Inventory();
        transaction = new Transactions();
        lock = new ReentrantLock();
        idleState = new IdleState(this);
        hasMoneyState = new HasMoneyState(this);
        productSelectedState = new ProductSelectedState(this);
        dispenseState = new DispenseState(this);
        currentState = idleState;
    }
    public void insertCoin(Coin coin) {
        currentState.insertCoin(coin);
    }

    public void selectProduct(Product product) {
        currentState.selectProduct(product);
    }

    public void dispense() {
        currentState.dispense();
    }

    public void refund() {
        currentState.refind();
    }

    public void dispenseProduct() {
        lock.lock();
        try {
            Product product =
                    transaction.getSelectedProduct();

            if (!inventory.isAvailable(product)) {
                System.out.println("Out of stock");
                transaction.clear();
                currentState = idleState;
                return;
            }
            int amount =
                    transaction.getTotalAmount();
            if (amount < product.getPrice()) {
                System.out.println(
                        "Insufficient money");
                return;
            }
            inventory.removeProduct(product);
            int change =
                    amount - product.getPrice();
            System.out.println(
                    "Dispensing : "
                            + product.getName());
            System.out.println(
                    "Returning change : ₹"
                            + change);
            transaction.clear();
            currentState = idleState;
        }
        finally {
            lock.unlock();
        }
    }
    public IdleState getIdleState() {
        return idleState;
    }

    public HasMoneyState getHasMoneyState() {
        return hasMoneyState;
    }

    public ProductSelectedState getProductSelectedState() {
        return productSelectedState;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Transactions getTransaction() {
        return transaction;
    }

  }

