package com.jedyBank.classes;

import com.jedyBank.interfaces.IBranch;

import java.util.ArrayList;

public class Branch implements IBranch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    @Override
    public boolean newCustomer(String customerName, double initialTransaction) {
        if(findCustomer(customerName)==null && !customerName.equals("") && initialTransaction >= 0){
            Customer customer = new Customer(customerName, initialTransaction);
            this.customers.add(customer);
            return true;
        }
        else return false;
    }

    @Override
    public boolean addCustomerTransaction(String customerName, double transaction) {
        if((findCustomer(customerName) != null) && transaction > 0){
            findCustomer(customerName).addTransaction(transaction);
            return true;
        }
        else return false;
    }

    private Customer findCustomer(String customerName){
        for(Customer customer: this.customers){
            if(customer.getName().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        return null;
    }
}
