package com.mahi.arraysofobjectreferences;

import java.io.IOException;

import javax.imageio.IIOException;

public class ExceptionExamples {

	/*
	 * static void validate(int age) { if (age < 18) {
	 * System.out.println("Not Valid"); // throw new
	 * ArithmeticException("Not Valid"); } else {
	 * System.out.println("welcome to vote"); } }
	 */

	void m() {
		// throw new IOException("device error");
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception exception) {
			System.out.println("exception handeled");
		}
	}

	public void finalize() {
		System.out.println("finalize called");
	}

	public static void main(String[] args) {
		// validate(12);
		System.out.println("rest of the code...");
		ExceptionExamples exceptionExamples = new ExceptionExamples();
		exceptionExamples.p();
		ExceptionExamples exceptionExamples1 = new ExceptionExamples();
		ExceptionExamples exceptionExamples2 = new ExceptionExamples();
		exceptionExamples1 = null;
		exceptionExamples2 = null;
		System.gc();
	}
}
