package com.inheritance;

public class GoogleDrive extends Google{

	public void driveAsChild() {
		System.out.println("This is a third child class");
	}
	public static void main(String[] args) {
        GoogleDrive gg = new GoogleDrive();
        gg.parent();
        gg.driveAsChild();       
	}

}
