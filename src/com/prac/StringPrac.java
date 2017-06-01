package com.prac;

public class StringPrac {
	public static void main(String[] args) {
		String s = "abc";
		String s1 = "abc";
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
		String str1 = new String("Java is platform independent");

		if (s == s1) {
			System.out.println("String literals are equal using == operator");
		}
		if (str == str1) {
			System.out.println("String Objects are equals using == operator");
		}

		if (s.equals(s1)) {
			System.out.println("String literals are equal using equals method");
		} else {
			System.out
					.println("String literals are not equal using equals method");
		}
		if (str.equals(str1)) {
			System.out.println("String Objects are equals using equals method");
		} else {
			System.out
					.println("String Objects are not equals using equals method");
		}

		if (s.hashCode() == s1.hashCode()) {
			System.out.println("Equals");
		}
		if (str.hashCode() == str1.hashCode()) {
			System.out.println("Equals");
		}
	}
}
