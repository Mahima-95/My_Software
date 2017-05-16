package com.mahi.arraysofobjectreferences;

public class Gotcha {
	public static void main(String[] args) {
		// insert code here
		try { new Gotcha().go(); }
		catch (Exception e) { System.out.println("ouch"); }
	}

	void go() {
		go();
	}
}
