package com.mahi;

public class StaticExample {
	static int a = 5;
	int b = 7;
	static void abc() {
		System.out.println("Static Method");
		//System.out.println(b);
		//abcd();
	}



	public void abcd() {
		System.out.println("Non-static Method");
		++a;
		System.out.println(a);
	//	abc();
	}
	
	public static void main(String[] args) {
		System.out.println(StaticExample.a);
		StaticExample.abc();
		StaticExample staticExample = new StaticExample();
		//staticExample.abc();
		staticExample.abcd();
		//System.out.println(staticExample.b);
		System.out.println("after increment=" +staticExample.a);
	}
}
