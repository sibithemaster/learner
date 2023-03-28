package com.pm;

public class ExSwitch 
{

	public static void main(String[] args) 
	{		
       int condition=1;      
       switch(condition) 
       {       
         case 1:int a=10,b=20,c=a+b;
    	      System.out.println(c);
              break;
         case 2:int d=100,e=200,f=e-d;
    	      System.out.println(f);
              break;
         case 3:int g=50,h=25,i=g*h;
    	      System.out.println(i);
              break;
         case 4:int k=20,l=10,o=k/l;
    	      System.out.println(o);
              break;
         case 5:int m=25,n=10,p=m%n;
    	      System.out.println(p);
              break;
         default:System.out.println("Invalid case");
               break;      	   
       }
       
	}

}
