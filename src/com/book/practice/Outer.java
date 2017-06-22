package com.book.practice;

public class Outer extends OuterClass1 {

	private int i = 1;

	public Outer() {
		super();
	}

	class Inner {
		void test() {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Outer.Inner inner = new Outer(). new Inner();
		inner.test();
//		InnerClass1 class1 = new InnerClass1();
//		class1.test1();
//		OuterClass1.InnerClass1 class1 = new OuterClass1(). new InnerClass1();
//		class1.test1();
		
	}
}

class OuterClass1 {
	private int x = 5;

	public OuterClass1() {
		super();
	}

	class InnerClass1 {
		void test1() {
			System.out.println("Outer Class variable x:-" + x);
		}
	}
}
