package com.inheritance;

public class Child extends Parent{

	public void childMethod(){
		System.out.println("I have a flat");
	}
	
	public static void main(String[] args) {
		Child c = new Child();		
		c.grandParentMethod();
		c.parentMethod();
		c.childMethod();
	}
}
