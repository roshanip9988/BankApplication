package org.bankapplication.dto;

public class CurrentAccount extends TransactionService{
	
	//polymorphism concept
	
	public static void OpenAccount()
	{
		System.out.println("Open Current Account...");
	}
	
	public static void CloseAccount()
	{
		System.out.println("Current Account Closed...");	
	}

}
