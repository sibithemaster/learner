package org.standard;

public class Student {

	
	public void stuId() {
		System.out.println(1);
	}
	public void stuName() {
		System.out.println("Sibi");
	}
	public void stuDob() {
		System.out.println("24/11/1997");
	} 
	public void stuPhone() {
		System.out.println(9003690138l);
	} 
	public void stuEmail() {
		System.out.println("sibi@gmail.com");
	}
	public void stuAddress(){
		System.out.println("8th main road, Kasturibai nagar");
	}
	
	public static void main(String[] args) {
	
		Student s=new Student();
		s.stuId();
		s.stuName();
		s.stuEmail();
		s.stuPhone();
		s.stuDob();
		s.stuAddress();
		
	}
	
}
