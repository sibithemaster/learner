package com.netflix.login;

public class ICICIUser extends ATM{

	public void message()
    {
   	 System.out.println("Welcome to ICICI bank.....");
    }
	
	@Override
	void withDrawCash() {
		System.out.println("Withdrawn amount is 10000");
	}
	
//	public static void main(String[] args) {		
//		ICICIUser use = new ICICIUser();
//		use.message();
//		use.withDrawCash();
//	}

	

}
