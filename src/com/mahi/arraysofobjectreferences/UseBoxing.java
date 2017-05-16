package com.mahi.arraysofobjectreferences;

public class UseBoxing {
	boolean go(Integer integer) {
		Boolean ifso = true;
		Short s = 300;
		if (ifso) {
			System.out.println(++s);
		}
		return !ifso;
	}

	public static void main(String[] args) {
		UseBoxing boxing = new UseBoxing();
		boxing.go(5);
	}
}
