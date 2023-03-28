package com.methods;

public class WithOutArgsAndReturn 
{
	public static String leapYearCheck() 
	{
		int year=2023;
		
		//2023%4--remainder , 2023/4--quotient
		if(year%4==0)
		{
			return "It is a leap year";
		}else {
			return "It is a non leap year";
		}
		
	}	
	public static void main(String[] args) {

     // WithOutArgsAndReturn  w = new WithOutArgsAndReturn();
     System.out.println(  WithOutArgsAndReturn.leapYearCheck() );
       
	}
}
//2023-2020=3
//2020