package com.jedyBank.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {
    private Bank bank;

    @Before
    public void setUp() throws Exception {
        bank = new Bank("TestBank");
        // adding a  new branch to the Bank
        bank.addBranch("London Branch");
        // adding a customer(John) to the London Branch
        bank.addCustomer("London Branch", "John", 500.0);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addBranch() {
        // This method should be able to add new branch and return true
        assertTrue(bank.addBranch("Paris Branch"));
        // this method should not be able to add new branch and return false since the branch exits already
        assertFalse(bank.addBranch("London Branch"));
    }

    @Test
    public void addCustomer() {
        // This method should be able to add new Customer
        assertTrue(bank.addCustomer("London Branch", "Jane", 200.00));
        //  This method should not return false since a Customer already exits
        assertFalse(bank.addCustomer("London", "John", 50.00));
    }

    @Test
    public void addCustomerTransaction() {
        //This method should allow a customer in a branch deposit to deposit
        assertTrue(bank.addCustomerTransaction("London Branch", "John", 500.00));
        // This method show that a customer who is not in the branch can't deposit in that branch
        assertFalse(bank.addCustomerTransaction("London Branch", "Mary", 500.00));
    }

    @Test
    public void listCustomers() {
        // This method is used to list the customers that exits in a particular branch
        assertTrue(bank.listCustomers("London Branch", true));
        // This method shows a branch that does not exit should return false
        assertFalse(bank.listCustomers("Barcelona", false ));
    }
}