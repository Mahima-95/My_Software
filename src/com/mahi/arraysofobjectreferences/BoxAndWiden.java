package com.mahi.arraysofobjectreferences;

public class BoxAndWiden {
	static void go(Object object) {
		Byte byte1 = (Byte) object;
		System.out.println(byte1);
	}

	public static void main(String[] args) {
		byte b = 5;
		go(b); // can this byte turn into an Object ?
	}
}
