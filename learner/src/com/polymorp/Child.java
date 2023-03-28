package com.polymorp;

public class Child extends Parent{

	public void money() {
   	 System.out.println("Money as cash");
    }
	
	public static void main(String[] args) {		
      Child c=new Child();
      c.money();
//	  Parent p = new Parent();
//	  p.money();
	}

}
