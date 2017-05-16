package com.mahi.arraysofobjectreferences;

public class Car {

	static int x;
	int y;
	static {
		x = 7;
	}
	{
		y = 8;
	}

	public void test() {

		int a[] = {};
		int b[][] = new int[3][];
		b[0] = a;
		int[] abc = new int[3];
		a = abc;
		abc = a;

		int bcd[][] = new int[3][];
		int[] abcd = new int[3];
		int num = 7;
		bcd[0] = abcd;

	}

	public static void main(String[] args) {
		Car car = new Car();
		car.test();
		System.out.println("Static" + x);
	}
}
