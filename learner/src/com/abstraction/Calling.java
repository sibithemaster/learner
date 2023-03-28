package com.abstraction;

public class Calling {
	public static void main(String[] args) {
		RBL r=new RBL();	
		System.out.println("Interest amount for RBL : "+r.interestRate());
		SBI s = new SBI();
		System.out.println("Interest amount for SBI : "+s.interestRate());
		IDFC i = new IDFC();
		System.out.println("Interest amount for IDFC : "+i.interestRate());
	}
}
