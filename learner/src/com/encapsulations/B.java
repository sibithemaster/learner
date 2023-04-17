package com.encapsulations;

public class B extends A 
{
    int id=100;
  
	private void num() 
	{
	  int id=10;
	  System.out.println(super.id);
	} 

	public static void main(String[] args) 
	{
	  B s=new B();
	  s.num();
	}
}
//local,static,instance,global
//this , super method
