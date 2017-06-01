package com.prac;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReverseString {
	public void testReverse(String str) {
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(ch[i]);
		}
		StringBuilder builder = new StringBuilder(str);
		System.out.println("Via reverse method:-" + builder.reverse());
	}

	public void testDuplicate(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
		System.out.println("Duplicate Characters are as follows:");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[j]);
					count++;
				}
			}
		}
	}

	public void testDuplicateWithHashMap(String str) {
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character character: ch){
		}
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = scanner.nextLine();
		reverseString.testReverse(str);
		reverseString.testDuplicate(str);
	}
}