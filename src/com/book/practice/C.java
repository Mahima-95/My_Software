package com.book.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C {

	public static void main(String[] args) {
		Object o = new Object();
		// insert code here
		// Set<Object> s = new HashSet<Object>();
		TreeSet<Object> s = new TreeSet();
		// LinkedHashSet<Object> s = new LinkedHashSet();
		s.add("o");
		s.add(o);
		System.out.println(s);
	}
}
