package com.interace;

public class Child implements Parent{
	@Override
	public void add() {
        System.out.println("Child calling interface");		
	}
	public static void main(String[] args) {
		    Child c = new Child();
			c.add();
	}
}
