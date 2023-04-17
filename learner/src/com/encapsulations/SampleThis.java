package com.encapsulations;

public class SampleThis 
{	
	public SampleThis()
	{
		this(10);
	} 
	public SampleThis(int a)
    {
		System.out.println(a);
    	System.out.println("Addition");
    }
	
	public static void main(String[] args) 
	{		
       SampleThis s = new SampleThis();
	}

}
