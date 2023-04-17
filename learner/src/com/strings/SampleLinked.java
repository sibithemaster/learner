package com.strings;

import java.util.LinkedList;
public class SampleLinked {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(10);
		System.out.println(list);		
		for(Integer i: list){System.out.println(i);}
		try {System.out.println(list.remove(10));
		}catch(IndexOutOfBoundsException ie) {System.out.println("Message : "+ie.getMessage());}		
		System.out.println(list.remove(0));
		System.out.println(list);}}
