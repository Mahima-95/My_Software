package com.book.practice;

public class InnerClassExample {

	private int i=0;
	
	class InnerClass{
		
		public void test(){
			System.out.println("Outer i is " + i);
			System.out.println("Inner class ref is " +this);
			System.out.println("Outer class ref is "  +InnerClassExample.this);
		}
	}
	public static void main(String[] args) {
		InnerClassExample.InnerClass classExample = new InnerClassExample().new InnerClass();
		classExample.test();
		
		InnerClassExample classExample2 = new InnerClassExample();
		InnerClassExample.InnerClass inner = classExample2. new InnerClass();
		inner.test();
	}
	
}
