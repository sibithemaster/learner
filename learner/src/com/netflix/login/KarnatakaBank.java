package com.netflix.login;

public class KarnatakaBank implements ATMmachine
{
	@Override
	public void displayBalanceAmount() {        		
		System.out.println("Your balance is 12000");
		System.out.println("Display shown in Karnataka Bank ATM");
	}
}
