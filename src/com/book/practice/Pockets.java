package com.book.practice;

import java.util.*;

public class Pockets {
	public static void main(String[] args) {
		String[] sa = { "nickel", "button", "key", "lint" };
		Sorter s = new Sorter(); // it created compilation error
		for (String s2 : sa)
			System.out.print(s2 + " ");
		Arrays.sort(sa, s);
		System.out.println();
		for (String s2 : sa)
			System.out.print(s2 + " ");
	}

	// need to add static keyword for this class to access it from main method without using its instance object
	// or declare this class into main method
	static class Sorter implements Comparator<String> {
		public int compare(String a, String b) {
			return b.compareTo(a);
		}
	}
 }