package com.netflix.login;

public class RBLUser extends ATM{

	public void message()
    {
   	 System.out.println("Welcome to Rbl bank.....");
    }
	@Override
	void withDrawCash() {
		System.out.println("Withdrawn amount is 1500");
	}
	
//	public static void main(String[] args) {
//		RBLUser rbl = new RBLUser();
//		rbl.message();
//		rbl.withDrawCash();
//
//	}
//
}
