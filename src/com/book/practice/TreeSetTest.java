package com.book.practice;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		String elements[] = { "A", "C", "D", "G", "F" };
		TreeSet<String> set = new TreeSet(Arrays.asList(elements));
		System.out.println(set);
		System.out.println(set.tailSet("C"));
		System.out.println(set.headSet("C"));
		System.out.println(set.headSet("C\0"));
		System.out.println(set.tailSet("C\0"));
		System.out.println(set.subSet("C", "F\0"));
		System.out.println(set.subSet("C", "C\0"));
		System.out.println(set.subSet("C", "C"));
		//delete last entry in this set
		set.pollLast();
		System.out.println(set);
		//delete first entry in this set
		set.pollFirst();
		System.out.println(set);
		//it uses to reverse treeset
		NavigableSet<String> res = set.descendingSet();
		System.out.println(res);
	}
}
