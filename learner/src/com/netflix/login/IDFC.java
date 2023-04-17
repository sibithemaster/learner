package com.netflix.login;

public class IDFC implements ATMmachine
{

	@Override
	public void displayBalanceAmount() {        		
		System.out.println("Your balance is 10000");
		System.out.println("Display shown in IDFC Bank ATM");
	}
}

