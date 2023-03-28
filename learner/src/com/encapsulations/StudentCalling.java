package com.encapsulations;

public class StudentCalling 
{

	//int a
	//public void add(){}
	public static void main(String[] args) 
	{		
        Student s = new Student();
        s.setStudentId(101);
        s.setStudentName("Karthick");
        s.setCollegeName("SRM");
        
        System.out.println(s.getStudentId());
        System.out.println(s.getStudentName());
        System.out.println(s.getCollegeName());
	}

}
//oops 1.Class and objects 2.inheritance 3.polymorphism  4.abstaction 5.Encapsulation