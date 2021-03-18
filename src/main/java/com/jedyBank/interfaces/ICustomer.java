package com.jedyBank.interfaces;

import java.util.ArrayList;

public interface ICustomer {
    String getName();
    ArrayList<Double> getTransaction();
    void addTransaction(Double transaction);
}
