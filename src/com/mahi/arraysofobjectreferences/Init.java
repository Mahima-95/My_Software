package com.mahi.arraysofobjectreferences;

public class Init {
	private int x;

	static int[] a = new int[4];

	static {
		// a[4] = 5;// this line produces error bcz of
		/*
		 * Exception in thread "main" java.lang.ExceptionInInitializerError
		 * Caused by: java.lang.ArrayIndexOutOfBoundsException: 4 at
		 * com.mahi.arraysofobjectreferences.Init.<clinit>(Init.java:9)
		 */
		a[3] = 5;
	}

	public Init(int x) {
		super();
		this.x = x;
		System.out.println("1-arg const");
	}

	public Init() {
		super();
		System.out.println("no-arg const");
	}

	static {
		System.out.println("1st static init");
	}

	{
		System.out.println("1st instance init");
	}
	{
		System.out.println("2nd instance init");
	}
	static {
		System.out.println("2nd static init");
	}

	public static void main(String[] args) {
		new Init();
		System.out.println("**********2nd block" + " 2nd block**********");
		new Init(5);

	}
}
