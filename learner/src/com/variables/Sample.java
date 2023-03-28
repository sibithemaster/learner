package com.variables;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=200,b=100;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);
        
        int age=20;
        String nationality="Indian";
        
//        if(age>18)
//        {
//        	if(nationality.equals("Indian")) {
//        		System.out.println("Eligible to vote");
//        	}
//        }else {
//        	System.out.println("Not eligible to vote");
//        }
//        
        
        
        int condition=5;
        switch(condition)
        {
          case 1:int a=100,b=200;
        	   System.out.println(a+b);
               break;
          case 2:int c=100,d=200;
        	   System.out.println(c-d);
               break;
          case 3:int f=100,e=200;
        	   System.out.println(e*f);
               break;       
          default: System.out.println("Invalid case");
               break;
               
       }

        
	}

}
