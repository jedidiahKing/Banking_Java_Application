package com.jedyBank.interfaces;

import com.jedyBank.classes.Customer;

import java.util.ArrayList;

public interface IBranch {
    String getName();
    ArrayList<Customer> getCustomers();
    boolean newCustomer(String customerName, double initialTransaction);
    boolean addCustomerTransaction(String customerName, double transaction);
}
