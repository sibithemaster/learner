package com.exceptions.custom;

public class MyException extends Exception
{
	public MyException(String s)
	{
		// Call constructor of parent Exception
		super(s);
	}
}
