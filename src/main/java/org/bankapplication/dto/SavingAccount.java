package org.bankapplication.dto;

public class SavingAccount extends TransactionService{
	
	//polymorphism concept
	
	public static void OpenAccount() {
		
		System.out.println("Open Saving Account");
		
	}
	
	public static void CloseAccount(String s)
	{
		System.out.println(s + " Saving Account Closed...");	
	}
	
	

}
