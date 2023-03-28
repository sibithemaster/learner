package com.exceptions;

import java.io.IOException;

public class SampleThrows 
{
	private static void info() throws IOException 
	{
		System.out.println("hello");
		throw new IOException("Input Output Excetion");
	}
	
	public static void main(String[] args) throws Exception {
		SampleThrows.info();		
	}

}
