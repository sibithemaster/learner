package com.exceptions;

public class NullExceptions {

	public static void main(String[] args) {

		String s=null;
		String i="INDIA";      

		try {
			if(s.equals(i)) {
				System.out.println("Equal");
			}else{
				System.out.println("Not Equal");
			}	
		}catch(NullPointerException e) {
			System.out.println("Exception caught : "+e.getMessage());
		}

		//System.out.println(s);
		System.out.println("value of i : "+i);

	}

}
