package com.mahi;

public class StringPractice {

	private String s;

	public StringPractice(String s) {
		super();
		this.s = s;
	}

	public void test() {

		String s = "Hello";
		String t = s;
		System.out.println(t.toUpperCase());
		System.out.println(s);
		int x = 4;
		int[] arr = { 1, x, 2 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("2 D array/n");
		int[][] scores = { { 5, 2, 4, 7 }, { 9, 2 }, { 3, 4 } };
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println("Multidementional arrays" + scores[i][j]);
			}
		}
	}

	public void test1() {
		int[] scores = new int[] { 1, 2, 3 };
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
	}

	public void test2(int[] hi) {
		System.out.println(hi);
	}

	public static void main(String[] args) {
		StringPractice practice = new StringPractice("mahima");
		StringPractice[] practices = { practice, new StringPractice("mahi"),
				new StringPractice("How r u?") };
		practice.test();
		practice.test1();
		practice.test2(new int[] { 1, 2, 3 });
		StringPractice[][] myStringArray = {
				{ new StringPractice("HYI"), new StringPractice("Hiiiii") },
				{ new StringPractice("Hyeeeeeee"), new StringPractice("Hello") } };
	}
}
