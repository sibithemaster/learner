package com.inheritance;

public class Youtube extends Google{

	public void youtubeAsChild() {
		System.out.println("This is a second child class");
	}
	public static void main(String[] args) {
		Youtube y = new Youtube();
		y.parent();
		y.youtubeAsChild();		
	}

}
