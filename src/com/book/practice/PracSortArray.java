package com.book.practice;

import java.util.Arrays;
import java.util.Comparator;

public class PracSortArray {
	public static void main(String[] args) {
		System.out.println("unsorted array-");
		String[] res = { "hi", "mahima", "agrawal" };
		for (String s : res)
			System.out.print(s + " ");
		System.out.println("\n sorted array-");
		Arrays.sort(res);
		for (String s : res)
			System.out.print(s + " ");
		System.out.println("\n mahima position= "
				+ Arrays.binarySearch(res, "mahima"));

		System.out.println("now reverse sort");
		ReverseSort reverseSort = new ReverseSort();
		Arrays.sort(res, reverseSort);
		for (String s : res)
			System.out.print(s + " ");

		System.out.println("\n mahima position= "
				+ Arrays.binarySearch(res, "mahima"));
		System.out.println(" mahima position= "
				+ Arrays.binarySearch(res, "mahima", reverseSort));
	}

	static class ReverseSort implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);
		}

	}
}