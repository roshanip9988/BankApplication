package org.bankapplication.services;

abstract class Account {
	
	  public abstract void OpenSavingAccount(); //abstract method
	  
	  // Regular method
	  
	  public void OpenCurrentAccount() {
		  
		  System.out.println("Reuesting for opening new Current Account..");
	  }
}

class SavingAcc extends Account
{

	//implementing abstract method
	
	@Override
	public void OpenSavingAccount() {
		
		 System.out.println("Reuesting for opening new Saving Account..");
	}
	
}
