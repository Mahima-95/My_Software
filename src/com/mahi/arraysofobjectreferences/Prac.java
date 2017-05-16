package com.mahi.arraysofobjectreferences;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Prac {

	public void test() {
		boolean problem = true;
		while (true) {
			if (problem) {
				System.out.println("There was a problem");
				break;
			}
		}
		// next line of code
	}

	public void test1() {
		boolean isTrue = true;
		outer: for (int i = 0; i < 5; i++) {
			while (isTrue) {
				System.out.println("Hello");
				break outer;
			} // end of inner while loop
			System.out.println("Outer loop."); // Won't print
		} // end of outer for loop
		System.out.println("Good-Bye");
	}

	public void test2() {
		outer: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Hello");
				continue outer;
			} // end of inner loop
			System.out.println("outer"); // Never prints
		}
		System.out.println("Good-Bye");
	}

	public static void main(String[] args) {

		/*
		 * Prac prac = new Prac(); prac.test(); //prac.test1(); prac.test2();
		 */

		/*
		 * String s1 = "Hello"; String s2 = "Hello";
		 * 
		 * System.out.println(s1); System.out.println(s2);
		 * 
		 * s1 = "Mahima";
		 * 
		 * System.out.println(s1); System.out.println(s2);
		 */

		test11();

	}

	public static void m1(Number number) {

		/*
		 * try{
		 * 
		 * }catch(Exception exception){
		 * 
		 * }finally{
		 * 
		 * }
		 */
		try {
			System.out.println("Hello");
		}
		catch(Exception exception) {
			System.out.println("Hello");
		}
	}

	public static void test11() {

		/*
		 * try { int a = 0; a = 2 / 0; } catch (IndexOutOfBoundsException i) {
		 * System.out.println(i); } catch (ArithmeticException e) {
		 * System.out.println("Arithmatic Exception"); }
		 */

		try {
			int a = 2 / 0;
		} catch (Exception e) {
			System.out.println("Hello");
		} catch (Throwable e) {
			System.out.println("Hello");
		}

		BufferedReader br = new BufferedReader(null);
		// br.read();
		int b = 3 / 0;
		Number n = new Integer(1);

	}
}
