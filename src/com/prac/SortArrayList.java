package com.prac;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		// arraylist.add(10010);
		// arraylist.add(5);
		// arraylist.add(4);
		// arraylist.add(2);
		System.out.println("Enter numbers");
		for (int i = 0; i <= 5; i++) {
			arraylist.add(scanner.nextInt());
		}

		for (int i = 0; i < arraylist.size(); i++) {

			for (int j = arraylist.size() - 1; j > i; j--) {
				if (arraylist.get(i) > arraylist.get(j)) {

					int tmp = arraylist.get(i);
					arraylist.set(i, arraylist.get(j));
					arraylist.set(j, tmp);

				}

			}

		}
		for (int i : arraylist) {
			System.out.println(i);
		}
	}
}
