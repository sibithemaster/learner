package com.variables;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] =new int[5];
        
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
   
        System.out.println(a[1]);
        System.out.println(a.length);
        
//        for(int i=0;i<=a.length-1;i++)
//        {
//        	System.out.println(a[i]);
//        }
        
        for(int i=a.length-1;i>=0;i--)
        {
        	System.out.println(a[i]);
        }
	}

}
