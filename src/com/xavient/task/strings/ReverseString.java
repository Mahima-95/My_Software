package com.xavient.task.strings;

public class ReverseString {

	/*
	 * public void St(){ String s = "mahima"; char[] a =new char[s.length()];
	 * int len=s.length(); for(int i = 0; i<s.length();i++) a[i]=s.charAt(i);
	 * for(int i=s.length()-1;i>=0;i--) System.out.print(a[i]); }
	 */
	public void reverseSt() {
		String s = "mahima";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	public void reverseStr() {
		String s = "mahima";
		int len = s.length();
		System.out.println("\n");
		for (int i = len - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		//reverseString.St();
		reverseString.reverseSt();
		reverseString.reverseStr();
	}
}
