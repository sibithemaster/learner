package com.inheritance;

public class HybridDaughter extends HybridChild{
	public void daughterMethod() {
		System.out.println("This is Daughter method");
	}
	
	public static void main(String[] args) {		
		HybridDaughter hd= new HybridDaughter();
		hd.daughterMethod();
        hd.grandParentCall();	
		hd.parentCall();
		hd.childCall();		 
	}

}
