package com.inheritance;

public class SingleChild extends SingleParent{
          
	public void money() 
	{
		System.out.println("This is childs money");
	}	
	public static void main(String[] args) 
	{
	   SingleChild child = new SingleChild();	
	   System.out.println("Calling via child class object");
	   SingleChild.land();
	   child.money();   
	}
}
