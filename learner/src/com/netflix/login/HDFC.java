package com.netflix.login;

public class HDFC implements ATMmachine
{
	@Override
	public void displayBalanceAmount() {        		
		System.out.println("Your balance is 15000");	
		System.out.println("Display shown in HDFC Bank ATM");
	}
   
}
