package com.book.practice;


public class OuterClass {

	private int x = 5;
	void stuff(){
		String z = "local variable";
		class InnerClass{
			public void test(){
				System.out.println("Outer x is " + x);
				System.out.println("Outer x is " + z);
				System.out.println("Inner class ref is " +this);
				System.out.println("Outer class ref is "  +OuterClass.this);
			}
		}
		InnerClass mi = new InnerClass(); 
		mi.test();
	}
}
