package com.xavient.abstracttest;

public class AbstractClass {

	public void test() {
		for (int i = 1; i <= 5; i++) {
			for (int s = 5; s > i; s--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
	public void test1() {
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int s = 5; s > i; s--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		AbstractClass abstractClass = new AbstractClass();
		abstractClass.test();
		abstractClass.test1();
	}
}
