package com.inheritance;

public class HybridSon extends HybridChild
{

	public void sonMethod() {
		System.out.println("This is Son method");
	}
	
	public static void main(String[] args) {
		HybridSon hs = new HybridSon();
		hs.sonMethod();
		hs.grandParentCall();
		hs.parentCall();
		hs.childCall();
		
	}

}
