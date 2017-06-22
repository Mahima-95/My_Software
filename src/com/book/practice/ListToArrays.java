package com.book.practice;

import java.util.ArrayList;
import java.util.List;

public class ListToArrays {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		/* for (int x = 0; x < 3; x++) list.add(x); */
		Object[] res = list.toArray();
		Integer[] integers = new Integer[3];
		integers = list.toArray(integers);
		System.out.println(list);
	}
}