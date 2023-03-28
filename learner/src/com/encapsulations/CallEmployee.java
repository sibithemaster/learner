package com.encapsulations;

public class CallEmployee {

	public static void main(String[] args) {
	 
		Employee e=new Employee();
		e.setEmailId("anil123@gmail.com");
		e.setName("Anil");
		e.setPhoneNumber(9898898988l);
		
		System.out.println(e.getName());
		System.out.println(e.getEmailId());
		System.out.println(e.getPhoneNumber());

	}
}
