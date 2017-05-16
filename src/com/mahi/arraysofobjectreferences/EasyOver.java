package com.mahi.arraysofobjectreferences;

public class EasyOver {
	/*static void go(int x) {
		System.out.print("int ");
	}*/

	static void go(long x) {
		System.out.print("long ");
	}

//	static void go(double x) {
//		System.out.print("double ");
//	}

	static void go(Integer x) {
		System.out.println("Integer");
	}

	public static void main(String[] args) {

		/*byte b = 5;
		short s = 7;
		long l = 9;
		float f = 5.0f;*/
		int i = 5;
		go(i);
		/*go(b);
		go(s);
		go(l);
		go(f);*/
	}
}
