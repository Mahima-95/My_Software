package com.xavient.Array;

import java.util.Scanner;

public class Task {

	Scanner sc;
	int leftdiagonal = 0;
	int rightdiagonal = 0;

	public void print() {
		sc = new Scanner(System.in);
		System.out.println("Enter your values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int arr[][] = new int[a][b];
		System.out.println("Enter rows and columns");
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 2) {
					rightdiagonal++;
				} else if (arr[i][j] == arr[i][j]) {
					leftdiagonal++;
				}
			}
		}

		System.out.println("rightdiagonal=" + rightdiagonal);
		System.out.println("leftdiagonal=" + leftdiagonal);
	}

	public static void main(String[] args) {
		Task task = new Task();
		task.print();
	}

}
