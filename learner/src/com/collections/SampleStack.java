package com.collections;

import java.util.Stack;

public class SampleStack {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		
		s.push("C");
		s.push("C++");
		s.push("JAVA");		
		s.push("PYTHON");
		s.push("RUBY");
		
		System.out.println(s);
		System.out.println(s.peek());	
		System.out.println(s.pop());

	}

}
