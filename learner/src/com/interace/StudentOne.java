package com.interace;

import java.util.Scanner;

public class StudentOne implements Maths{
	Scanner sc = new Scanner(System.in); 
	int a=sc.nextInt();
	int b=sc.nextInt();
	@Override
	public void add() {
		System.out.println("Addition output : "+ (a+b));
	}
	@Override
	public void subtract() {
		System.out.println("subtraction output : " + (a-b));
	}
	@Override
	public void multiplication() {
		System.out.println("Multiplication output : "+a*b);
	}
	@Override
	public void division() {
		System.out.println("Division output : "+a/b);
	}
	public static void main(String[] args) {	
      //  Maths m = new Maths();
	 // Maths s = new StudentOne();
	  StudentOne s = new StudentOne();
	  s.add();
	  s.subtract();
	  s.multiplication();
	  s.division();
	}

}
