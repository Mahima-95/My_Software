package com.mahima.reverse.string;

import java.util.Scanner;

public class ReverseString {
	Scanner scanner = new Scanner(System.in);

	public void test() {
		System.out.println("Enter any string to reverse");
		String sc = scanner.next();
		int length = sc.length();
		System.out.println("Reverse String :");
		for (int i = length - 1; i >= 0; i--) {
			char ch = sc.charAt(i);
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.test();
	}
}
