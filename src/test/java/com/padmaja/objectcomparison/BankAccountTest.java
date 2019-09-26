package com.padmaja.objectcomparison;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void test_object_not_null() {
        BankAccount b1 = new BankAccount();
        b1.acctNumber = "0023490";
        b1.acctType = 5;

        BankAccount b2 = new BankAccount();
        b2.acctNumber = "0023490";
        b2.acctType = 5;

        //test_object_not_null
        boolean RESULT1 = (b1.equals(b2));
        System.out.println(RESULT1);
        boolean expResult1 = true;
        assertEquals(expResult1, RESULT1);
    }
    @Test
    public void test_object_null() {
        BankAccount b1 = new BankAccount();
        b1.acctNumber = "0023490";
        b1.acctType = 5;

        //bBankAccount b2 = new BankAccount();
        BankAccount b2 =  null;
        //b2.acctNumber = null;
        //b2.acctType = 0;


        //test_object__null
        boolean RESULT = (b1.equals(b2));
        System.out.println(RESULT);
        boolean expResult1 = false;
        assertEquals(expResult1, RESULT);

    }


    @Test
    public void test_equals_acctNumber() {
        BankAccount b1 = new BankAccount();
        b1.acctNumber = "0023490";
        b1.acctType = 5;

        BankAccount b2 = new BankAccount();
        b2.acctNumber = "0023490";
        b2.acctType = 5;


        boolean RESULT = (b1.equals(b2));
        System.out.println(RESULT);
        boolean expResult1 = true;
        assertEquals(expResult1, RESULT);

    }

    @Test
    public void test_notequal_acctNumber() {
        BankAccount b1 = new BankAccount();
        b1.acctNumber = "0023490";
        b1.acctType = 5;
        BankAccount b2 = new BankAccount();
        b2.acctNumber = "0023490000087878";
        b2.acctType = 5;

        boolean RESULT = (b1.equals(b2));
        System.out.println(RESULT);
        boolean expResult1 = false;
        assertEquals(expResult1, RESULT);
    }

    @Test
    public void test_equals_acctType() {
        BankAccount b1 = new BankAccount();
         b1.acctNumber = "0023490";
        b1.acctType = 5;
        BankAccount b2 = new BankAccount();
        b2.acctNumber = "0023490";
        b2.acctType = 5;

        boolean RESULT = (b1.equals(b2));
        System.out.println(RESULT);
        boolean expResult1 =  true;
        assertEquals(expResult1, RESULT);
    }

    @Test
    public void test_notequal_acctType() {
        BankAccount b1 = new BankAccount();
        b1.acctNumber = "0023490";
        b1.acctType = 5;
        BankAccount b2 = new BankAccount();
        b2.acctNumber = "0023490";
        b2.acctType = 6;

        boolean RESULT = (b1.equals(b2));
        System.out.println(RESULT);
        boolean expResult1 =  false;
        assertEquals(expResult1, RESULT);
    }
}