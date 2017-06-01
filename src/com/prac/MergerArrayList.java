package com.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MergerArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Strings for first arraylist");
		for (int i = 0; i <= 2; i++) {
			arrayList.add(scanner.next());
		}

		// for sorting array list using collections.sort method
		System.out.println("After sort");
		Collections.swap(arrayList, 1, 0);
		for (String temp : arrayList) {
			System.out.println(temp);
		}

		ArrayList<String> arrayList1 = new ArrayList<String>();
		System.out.println("Enter Strings for second arraylist");
		for (int i = 0; i <= 2; i++) {
			arrayList1.add(scanner.next());
		}

		// Merge first and second array lists in another list
		ArrayList<String> arrayListMerge = new ArrayList<String>();
		System.out
				.println("Merge first and second array lists in another list");
		arrayListMerge.addAll(arrayList);
		arrayListMerge.addAll(arrayList1);

		// Merge first and second array lists in first list
		System.out.println("Merge first and second array lists in first list");
		arrayList.addAll(arrayList1);
		System.out.println(arrayList);

		for (String temp : arrayListMerge) {
			System.out.println(temp);
		}
	}
}
