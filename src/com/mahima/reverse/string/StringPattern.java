package com.mahima.reverse.string;

public class StringPattern {

	public void printPattern() {
		System.out.println("Print Number Pattern");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + "");
			}
			System.out.println();
		}
	}

	public void printStringPattern() {
		System.out.println("Print Small alphabet Pattern");
		for (char i = 'a'; i < 'f'; i++) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j + "");
			}
			System.out.println();
		}
	}

	public void printCapsStringPattern() {
		System.out.println("Print Capital alphabet Pattern");
		for (char i = 'A'; i < 'F'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j + "");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		StringPattern pattern = new StringPattern();
		pattern.printPattern();
		pattern.printStringPattern();
		pattern.printCapsStringPattern();
	}
}
