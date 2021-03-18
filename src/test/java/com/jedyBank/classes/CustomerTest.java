package com.jedyBank.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Jedy", 2500.00 );
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getName() {
        //this method get the name of the customer object and checks to see if it is "Jedy"
        assertEquals("Jedy", customer.getName());
        //this method get the name of the customer object and checks to see if it is "Jefferson" which is not
        assertNotEquals("Jefferson", customer.getName());
    }

    @Test
    public void getTransaction() {
        //this method get the amount in the transaction
        assertEquals(2500.00, customer.getTransaction().get(0), 0.0);
        // this method checks if the amount in the transaction matches
        assertNotEquals(250.00, customer.getTransaction().get(0), 0.0);
    }

    @Test
    public void addTransaction() {
        // adding new transaction
        customer.addTransaction(200.00);
        //checking the transactions added
        assertEquals(2, customer.getTransaction().size());
    }
}