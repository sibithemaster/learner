package com.encapsulations;

public class CallEmployee 
{
	public static void main(String[] args) 
	{	 
		Employee e=new Employee();
		
		e.setEmailId("anil123@gmail.com");
		e.setName("Anil");
		e.setPhoneNumber(9898898988l);
	
		System.out.println("Employee Name : "+e.getName());
		System.out.println("Employee email : "+e.getEmailId());
		System.out.println("Employee phone number : "+e.getPhoneNumber());

	}
}
