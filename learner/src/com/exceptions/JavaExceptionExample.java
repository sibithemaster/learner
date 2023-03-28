package com.exceptions;

public class JavaExceptionExample{  
	  public static void main(String args[]){  
	   try{  
	      //code that may raise exception  
	      int data=100/0;  
	   }
	   
	   catch(ArithmeticException e){System.out.println(e);}  
	   catch(Exception ex)
	   {
		   System.out.println(ex);
	   }
	   //rest code of the program   
	   System.out.println("rest of the code...");  
	  }  
	}  
