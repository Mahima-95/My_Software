package com.book.practice;

public class OuterC {

	public OuterC() {
		super();
	}

	public OuterC(int j) {
		System.out.println(j);
	}

	class Inner {

		public Inner(int z) {
			System.out.println(z);
		}
	}
}