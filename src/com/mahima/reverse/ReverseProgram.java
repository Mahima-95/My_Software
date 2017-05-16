package com.mahima.reverse;

public class ReverseProgram {
	int n = 432, r = 0;

	public void test() {

		for (int i = 0; i < n; i++) {
			r = r * 10;
			r = r + n % 10;
			n = n / 10;
		}
		System.out.println(r);
	}

	public static void main(String[] args) {
		ReverseProgram reverseProgram = new ReverseProgram();
		reverseProgram.test();
	}
}
