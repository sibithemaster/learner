package com.constructors;

public class Animals 
{
	//default constructor
	Animals(){
		System.out.println("Lion");
	}
	//parameterized constructor
	Animals(String name){ 
		System.out.println(name);
	}
	Animals(String one,String two){
		System.out.println(one);
		System.out.println(two);
	}
	public static void main(String[] args) 
	{
		Animals a = new Animals();
		Animals b = new Animals("Cat");
		Animals c = new Animals("Dog","Cow");
	}

}
