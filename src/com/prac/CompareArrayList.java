package com.prac;

import java.util.ArrayList;
import java.util.Scanner;

public class CompareArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Strings for first arraylist");
		for (int i = 0; i <= 2; i++) {
			arrayList.add(scanner.next());
		}

		ArrayList<String> arrayList1 = new ArrayList<String>();
		System.out.println("Enter Strings for first arraylist");
		for (int i = 0; i <= 2; i++) {
			arrayList1.add(scanner.next());
		}

		// Storing the comparison output in ArrayList<String>
		ArrayList<String> arrayList2 = new ArrayList<String>();
		for (String temp : arrayList) {
			arrayList2.add(arrayList1.contains(temp) ? "Yes" : "No");
		}
		System.out.println(arrayList2);

		// Storing the comparison output in ArrayList<Integer>
		ArrayList<Integer> al4 = new ArrayList<Integer>();
		for (String temp2 : arrayList)
			al4.add(arrayList1.contains(temp2) ? 1 : 0);
		System.out.println(al4);
	}
}
