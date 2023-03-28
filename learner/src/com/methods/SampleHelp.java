package com.methods;

public class SampleHelp extends Sample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SampleHelp sampleHelp = new SampleHelp();
        sampleHelp.add();
        sampleHelp.subtract();
        
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("This method was called by child class");
	}

}
