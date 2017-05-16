package com.mahi.arraysofobjectreferences;

public class Vararg {
	static void wide_vararg(long... x) {
		System.out.println("long...");
	}

	static void box_vararg(Integer... x) {
		System.out.println("Integer...");
	}

	void test() {
		boolean boo = false;
		if (boo = true) {
			System.out.println(boo);
		}
	}

	public static void main(String[] args) {
		int i = 6;
		wide_vararg(i, i);
		box_vararg(i, i);
		Vararg vararg = new Vararg();
		vararg.test();
	}
}
