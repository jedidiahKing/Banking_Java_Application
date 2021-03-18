package com.jedyBank.classes;

import com.jedyBank.interfaces.ICustomer;

import java.util.ArrayList;

public class Customer implements ICustomer {
    private String name;
    private ArrayList<Double> transactinons;
    public Customer(String name, double initialTransaction){
        initialTransaction = initialTransaction < 0 ? 0 : initialTransaction;
            this.name = name;
            this.transactinons = new ArrayList<>();
            this.transactinons.add(initialTransaction);
        }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ArrayList<Double> getTransaction() {
        return this.transactinons;
    }

    @Override
    public void addTransaction(Double transaction) {
        if(transaction >= 0){
            this.transactinons.add(transaction);
        }
    }
}
