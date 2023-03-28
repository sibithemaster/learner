package com.abstraction;

public class BusMain extends Bus
{ 
	@Override
	public void busModel() {		
		System.out.println("Omni");
	}
	public void addBus() {
		System.out.println("Red bus");
	}
	public static void main(String[] args) {		
		BusMain b = new BusMain();		
		b.busNumber();
		b.busModel();
		b.addBus();
	}
	
	
//	void busModel() {		
//		System.out.println("Omni Bus");
//	}

}
