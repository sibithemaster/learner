package com.polymorphisms;

public class Employee 
{
	public void employeeDetails() {
		System.out.println("101 "+"Aravind "+"TCS");
		System.out.println();
	}
    
    public void employeeDetails(int ids) {
		System.out.println(ids);System.out.println();
	}
    
    public void employeeDetails(int id,String name) {
    	System.out.println("ID  "+"Name  ");
		System.out.println(id+" "+name);System.out.println();
	}
    
    public void employeeDetails(int id,String name,String company) {
		System.out.println("ID  "+"Name  "+"Company Name");
    	System.out.println(id+" "+name+" "+company);
	}
	
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.employeeDetails();
		e.employeeDetails(102);
		e.employeeDetails(102, "Krishna");
		e.employeeDetails(102, "Krishna", "Infosys");


	}
//	int a=10,b=20,temp=0;
//	temp=a;
//	a=b;
//	b=temp;
	
//	a=a-b;
//	b=a+b;
//	a=b-a;
////	System.out.println(b);
//	
//	System.out.println("a = "+a);
//	System.out.println("b = "+b);
//	
}
