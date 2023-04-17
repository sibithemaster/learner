package com.netflix.login;

public class UserWish {

	public static void main(String[] args) {
		
		ICICIUser user1 = new ICICIUser();	
		SBIUser user2 = new SBIUser();
		RBLUser user = new RBLUser();
		
		System.out.println("---------ICICI USER-----------");
		user.message();
		user.withDrawCash();
		System.out.println("---------SBI USER-------------");
		user1.message();
		user1.withDrawCash();
		System.out.println("---------RBL USER-------------");
		user2.message();
		user2.withDrawCash();
	}

}
