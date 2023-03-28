package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SampleLinkedList {
	public static void main(String[] args) {		
		List<Integer> l=new LinkedList<Integer>();		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(10);
		
		List<Integer> m=new ArrayList<Integer>();
		m.add(70);
		m.add(80);
		m.add(90);
		m.add(100);
		
		System.out.println("List l ==>"+l);
		System.out.println("List m ==>"+m);
		
		m.addAll(l);
		
		System.out.println(m);
		
		
		

		l.add(0, 100);
		System.out.println(l);
		System.out.println(l.contains(1000));
		System.out.println(l.indexOf(50));
		System.out.println(l.isEmpty());
		System.out.println(l.remove(4));
		System.out.println(l);
		
		Collections.sort(m);
		System.out.println(m);
		m.clear();
		System.out.println(m);
	}

}
