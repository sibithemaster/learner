package com.pm;

public class ExElseIf {
	public static void main(String[] args) {
		int a=10,b=20,c=15;

		if(a>b && a>c) {
			System.out.println("A is big");
		}else if(b>a && b>c) {
			System.out.println("B is big");
		}else {
			System.out.println("C is big");
		}
	}

}
