package com.strings;

public class Sample {

	public static void main(String[] args) {
		
		//string scp
		String s="sneha";
		s=s.concat("s");	
		System.out.println(s);
		
//charAt()--It is used to print the particular character
		String s1="sachin";
		System.out.println(s1.charAt(0));
		
//		== .equals
        System.out.println(s1.equals("sachin"));
        
//equals Ignore case        
        String a="Chennai";
        String b="chennai";
        boolean c=a.equalsIgnoreCase(b);
        System.out.println(c);
        
//contains        
        String s2 = "Hello welcome to java class";
        System.out.println(s2);
        boolean b1 = s2.contains("welcomee");
        System.out.println(b1);
        System.out.println(s2.length());
        
        String[] x=s2.split(" ");
        System.out.println(x.length);
        
        String[] y=s2.split("a");
        System.out.println(y.length);
        
        System.out.println(s2.toUpperCase());
        System.out.println(s2.toLowerCase());
        
        
        System.out.println(s2.substring(6,21));
        System.out.println(s2.indexOf("a"));
        System.out.println(s2.lastIndexOf("a"));
        
        System.out.println(s2.replace("Hello", "....."));
   //isEmpty()     
        String st="java";
        System.out.println(st.isEmpty());
   //startswith     
        System.out.println(st.startsWith("j"));
   //endswith
        System.out.println(st.endsWith("i"));
   
   //compareTo       
        System.out.println(st.compareTo("Java"));
        
    //    System.out.println(st.hashCode());
        
        System.out.println("Immutable string");
        String s3="sneha";
        String s4="sneha";
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
        
        System.out.println("mutable string");
        StringBuffer s5=new StringBuffer("sneha");
        StringBuffer s6=new StringBuffer("sneha");
        
        System.out.println(System.identityHashCode(s5));
        System.out.println(System.identityHashCode(s6));
        
 //append
        s5.append(s6);
        System.out.println(s5);
        System.out.println(System.identityHashCode(s5));
       
        
	}

}
