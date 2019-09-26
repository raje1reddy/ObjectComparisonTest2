package com.padmaja.objectcomparison;
import java.lang.String;

public class BankAccount {
    String acctNumber;
    int acctType;


       public boolean equals (BankAccount obj){
            if (obj != null) {
     //           BankAccount b = (BankAccount) obj;
                return (acctNumber.equals(obj.acctNumber) && acctType == obj.acctType);
            } else
                return false;
        }

    }



