package com.mahima.reverse.string;

import java.util.Scanner;

public class ReverseNumber {

	Scanner scanner = new Scanner(System.in);
	int reverse = 0;

	public void test() {
		System.out.println("Enter any number to reverse..!!!");
		int num = scanner.nextInt();
		for (int i = 0; i < num + 1; i++) {
			reverse = reverse * 10;
			reverse = reverse + num % 10;
			num = num / 10;
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		ReverseNumber number = new ReverseNumber();
		number.test();
	}
}
