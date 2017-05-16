package com.mahi.arraysofobjectreferences;

public class Practice {
	public void test() {
		String s = "xyz";
		switch (s.length()) {
		case 1:
			System.out.println("length is one");
			break;
		case 2:
			System.out.println("length is two");
			break;
		case 3:
			System.out.println("length is three");
			break;
		default:
			System.out.println("no match");
		}
	}

	public void test1() {
		final int a = 1;
		final int b;
		b = 2;
		int x = 0;
		switch (x) {
		case a:
			System.out.println(a);
			break;
		// case b: //compiler error
		// System.out.println(b);
		// break;
		}
	}

	public void test2() {
		byte g = 2;
		switch (g) {
		case 23:
			// case 128: //the second case argument (128) is too large for a
			// byte
		}

		switch (new Integer(4)) {
		case 4:
			System.out.println("boxing is OK");
		}
	}

	public void test3() {
		int x = 7;
		switch (x) {
		case 2:
			System.out.println("2");
		default:
			System.out.println("default");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		}
	}

	public static void main(String[] args) {
		Practice practice = new Practice();
		practice.test();
		practice.test1();
		practice.test2();
		practice.test3();
	}
}
