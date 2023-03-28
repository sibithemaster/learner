package com.days.conditional;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="prasana";
		int age=18;
		if(name!=null)
		{
			if(age>18)
			{
				System.out.println("Eligible to vote");
			}
			else {
				System.out.println("Not Eligible to vote");
			}
		}

	}

}
