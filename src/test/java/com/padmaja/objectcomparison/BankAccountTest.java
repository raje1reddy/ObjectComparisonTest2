package com.padmaja.objectcomparison;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void test1() {
        BankAccount b1 = new BankAccount();
        b1.acctNumber = "0023490";
        b1.acctType = 5;
        ArrayList <BankAccount> list = new ArrayList<BankAccount>();

        list.add(b1);
        boolean RESULTs = list.add(b1);;
        System.out.println(RESULTs);
        boolean expResult = true;
        assertEquals(expResult, RESULTs);

        BankAccount b2 = new BankAccount();
        b1.acctNumber = "0023490";
        b1.acctType = 5;
        //list.contains(b2);

        boolean RESULT = list.contains(b2);;
        System.out.println(RESULT);
        boolean expResults = false;
        assertEquals(expResults, RESULT);




    }
}