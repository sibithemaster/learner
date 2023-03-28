package com.days.conditionalswitch;

public class Maths 
{
	public static void main(String[] args) {		
        int condition=3;
        int a=20,b=10;
        switch(condition)
        {
          case 1:System.out.println(a+b);
                 break;
          case 2:System.out.println(a-b);
                 break;
          case 3:System.out.println(a*b);
                 break;
          case 4:System.out.println(a/b);
                 break;
          default :System.out.println("invalid case");
        }
	}

}
