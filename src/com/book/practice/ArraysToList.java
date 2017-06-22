package com.book.practice;

import java.util.Arrays;
import java.util.List;

public class ArraysToList {
	public static void main(String[] args) {
		String[] res = { "hi", "mahima", "agrawal" };
		// convert arrays to list
		List<String> list = Arrays.asList(res);
		System.out.println(list);
		// see size of list
		System.out.println("size= " + list.size());
		// change index 2 value in list
		list.set(2, "hello");
		System.out.println(list);
		// change index 1 value in arrays
		res[1] = "agg";
		System.out.println(list);
	}
}
