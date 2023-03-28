package com.days.conditional;

public class LeapYear {
	public static void main(String[] args) {
		int year=396;		
		boolean flag = false;
		
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }      
        else if(year<400) 
        {
        	flag = false;
        }        
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        
        
        if(flag==true)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }else{
            System.out.println("Year "+year+" is not a Leap Year");
        }
	}
}
