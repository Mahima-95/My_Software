package com.xavient.task.strings;

public class SortStringArray {

	public static void sort() {
		String temp = null;
		String a[] = { "2", "5", "8", "1", "3" };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (Integer.parseInt(a[i]) > Integer.parseInt(a[j])) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (String ar : a) {
			System.out.print(" " + ar);
		}
	}

	public static String sortString(String[] arr) {

		String res = arr.toString();
		return null;
	}

	public static void main(String[] args) {
		// SortStringArray.sort();
		String[] arr = { "mahima" };
		SortStringArray.sortString(arr);
	}
}
