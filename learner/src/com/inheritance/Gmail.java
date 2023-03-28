package com.inheritance;

public class Gmail extends Google{

	public void gmailAsChild() {
		System.out.println("This is a first child class");
	}
	public static void main(String[] args) {
        Gmail g = new Gmail();
        g.parent();
        g.gmailAsChild();       
	}

}
