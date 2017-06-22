package com.book.practice;

public class OuterWithConstructorChaining extends OuterC {
	/*private int outervariable = 21;

	public OuterWithConstructorChanning(int outervariable) {
		System.out.println("OuterWithConstructorChanning" +outervariable);
	}*/
	

	public OuterWithConstructorChaining(OuterC outerC, int z) {
		super();
	}


	/*class InnerClass {
		void test() {
			System.out.println("outervariable" + outervariable);
		}
	}*/

	public static void main(String[] args) {
		OuterWithConstructorChaining channing = new OuterWithConstructorChaining(new OuterC(5), 3);
	}
}