package org.bankapplication.services;

import org.bankapplication.dto.CurrentAccount;
import org.bankapplication.dto.SavingAccount;
import org.bankapplication.dto.TransactionService;

/**
 * OOP'S Concept (Inheritance, Abstract Class, Polymorphism Ovedrloading & Overriding, Encapsulation
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        TransactionService TS = new TransactionService();
        
        TS.DepositMoney();
        TS.WithdrawMoney();
        
        System.out.println();
        
        // Inheritance & Polymorphism - Overriding
        CurrentAccount CA = new CurrentAccount();
        CA.DepositMoney();
        CA.OpenAccount();
        CA.CloseAccount(); // Polymorphism - Overloading
        
        System.out.println();
       
     // Inheritance & Polymorphism - Overriding
        SavingAccount SA = new SavingAccount();
        SA.WithdrawMoney();
        SA.OpenAccount();
        SA.CloseAccount("Roshani"); // Polymorphism - Overloading
        
        System.out.println();
        
        // Example of Abstract Class
        
       SavingAcc sacc = new SavingAcc();
       sacc.OpenCurrentAccount();
       sacc.OpenSavingAccount();
        
        
       
        
    }
}
