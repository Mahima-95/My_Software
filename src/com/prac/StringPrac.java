package com.prac;

public class StringPrac {
	public static void main(String[] args) {
		String s = "abc";
		String s1 = "11";
		String s2 = "22";
		int i = 111;
		double d = 222;
		System.out.println(s + s1 + s2);
		System.out.println(s1 + s2 + s);
		System.out.println(i + d + s);
		System.out.println(s + i + d);

		String str = "Java is platform independent";
		char[] dst = str.toCharArray();
		for (char c : dst) {
			System.out.println(c);
		}
	}
}
