package com.book.practice;

public class BigOuter {
	static class Nest {
		void go() {
			System.out.println("hi");
		}
	}
}

class Broom {
	static class B2 {
		void goB2() {
			System.out.println("hi 2");
		}
	}

	public static void main(String[] args) {
		BigOuter.Nest n = new BigOuter.Nest(); // both class names
		n.go();
		B2 b2 = new B2(); // access the enclosed class
		b2.goB2();
	}
}

/*Just as a static method does not have access to the instance variables and
nonstatic methods of the class, a static nested class does not have access to the instance
variables and nonstatic methods of the outer class. Look for static nested classes with
code that behaves like a nonstatic (regular inner) class.*/
