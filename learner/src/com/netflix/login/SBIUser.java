package com.netflix.login;

public class SBIUser extends ATM{

	public void message()
    {
   	 System.out.println("Welcome to SBI bank.....");
    }
	
	@Override
	void withDrawCash() {
		System.out.println("Withdrawn amount is 1000");
	}
	
//	public static void main(String[] args) 
//	{
//	  SBIUser user = new SBIUser();
//	  user.message();
//	  user.withDrawCash();
//
//	}

}
