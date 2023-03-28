package com.abstraction;

public class BikeMain {

	public static void main(String[] args) {
		
		//one
		BikeOne one = new BikeOne();
		System.out.println(one.bikes("TVS"));
		
		//two
		BikeTwo two = new BikeTwo();
		System.out.println(two.bikes("Yamaha"));
		
		//three
		BikeThree three = new BikeThree();
		System.out.println(three.bikes("KTM"));

	}

}
