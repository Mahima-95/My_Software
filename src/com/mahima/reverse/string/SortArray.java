package com.mahima.reverse.string;

import java.util.Scanner;

public class SortArray {

	Scanner scanner = new Scanner(System.in);
	/* int[] arr = new int[5]; */
	int[] arr = { 2, 5, 4, 3, 1 };
	int sortedArr[] = new int[arr.length];
	int temp;

	public void sortedArray() {
		System.out.println("Enter number to sort");

		/* int[] arr = scanner; */
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				System.out.print(arr[i] + " ");
			}
		}

	}

	public void test() {

		
	}

	public static void main(String[] args) {
		SortArray array = new SortArray();
		array.sortedArray();
	}
}
