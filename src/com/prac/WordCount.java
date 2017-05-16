package com.prac;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your text here.!!!");
		String str = scanner.nextLine();
		/************ use this scenrio in easy way *************/
		/*
		 * String[] s = str.trim().split(" "); System.out.println("Words are:-"
		 * + s.length);
		 */
		/******************* use this in normal way *************************/
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}
}
