package com.jedyBank.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BranchTest {
    Branch branch;
    @Before
    public void setUp() throws Exception {
        branch = new Branch("Kumasi Branch");
        branch.newCustomer("Manuel", 500.00);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        //this method get the name of the branch object and checks to see if it is "Kumasi Branch"
        assertEquals("Kumasi Branch", branch.getName());
        //this method get the name of the customer object and checks to see if it is "London Branch" which is not
        assertNotEquals("London Branch", branch.getName());
    }

    @Test
    public void getCustomers() {
        //this method get the name of the branch object and checks to see if it is "Manuel"
        assertEquals("Manuel", branch.getCustomers().get(0).getName());
        //this method get the name of the branch object and checks to see if it is "Jefferson" which is not
        assertNotEquals("Jefferson", branch.getCustomers().get(0));
    }

    @Test
    public void newCustomer() {
        assertTrue(branch.newCustomer("Johnson", 500.00));


    }


    @Test
    public void addCustomerTransaction() {
        //This method should allow a customer in a branch deposit to his branch
        assertTrue(branch.addCustomerTransaction("Manuel",500.00));
        // This method show that a customer who is not in the branch can't deposit in that branch
        assertFalse(branch.addCustomerTransaction("yaw",500.00));
    }
}