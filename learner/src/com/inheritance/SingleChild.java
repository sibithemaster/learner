package com.inheritance;

public class SingleChild extends SingleParent{
          
	public static void money() 
	{
		System.out.println("This is childs money");
	}	
	public static void main(String[] args) 
	{  
	   System.out.println("Calling via child class object");
	   SingleChild.land();
	   SingleChild.money();   
	}
}
