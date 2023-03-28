package com.constructors;

public class Dog extends Animal
{  

	String color="black"; 
	
	Dog()
	{
		super(10);
	}
	
	void printColor()
	{  	
		//prints color of Dog class  
		System.out.println("This is dog class color: "+color);

		//prints color of Animal class
		System.out.println("This is Animal class color: "+super.color);  
	}  


}  
