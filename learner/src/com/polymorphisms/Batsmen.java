package com.polymorphisms;

public class Batsmen 
{

	public void cricketingShots() {
		System.out.println("Straight Drive");
	}
	
    public void cricketingShots(int a) {
    	System.out.println("Straight Drive six");
	}

    public void cricketingShots(int b,int c) {
    	System.out.println("Straight Drive and Cover Six");
    }
    
    public void cricketingShots(String s,int d) {
    	System.out.println("Sachin");
    	System.out.println("Straight drive four");
    }
    
    public String cricketingShots(String s)
    {
		return s;
    }
    

	public static void main(String[] args) {
		
        Batsmen b = new Batsmen();
        b.cricketingShots();
        b.cricketingShots(6);
        b.cricketingShots(6, 4);
        b.cricketingShots("Sachin", 6);
        
        System.out.println(b.cricketingShots("MSD"));
	}

}
