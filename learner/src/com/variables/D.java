package com.variables;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s[]= {"C","C++","Java","python"};
        
        System.out.println(s[0]);
        
        //syntax:for(Datatype variable:array)
        
        for(String a:s)
        {
        	System.out.println(a);
        }
        
        for(int i=s.length-1;i>=0;i--)
        {
        	System.out.println(s[i]);
        }
	}

}
