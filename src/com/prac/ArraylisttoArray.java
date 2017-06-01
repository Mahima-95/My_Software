package com.prac;

import java.util.ArrayList;

public class ArraylisttoArray {
	public void manualConversion() {
		System.out.println("***********manualConversion**********");
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("String1");
		arrayList.add("String2");
		arrayList.add("String3");
		arrayList.add("String4");

		String[] str = new String[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			str[i] = arrayList.get(i);
		}
		for (String temp : str)
			System.out.println(temp);
	}

	public void usingMethod() {
		System.out.println("***********usingMethod**********");
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("String1");
		arrayList.add("String2");
		arrayList.add("String3");
		arrayList.add("String4");
		String[] str = arrayList.toArray(new String[arrayList.size()]);
		for (String temp : str)
			System.out.println(temp);
	}

	public static void main(String[] args) {
		ArraylisttoArray array = new ArraylisttoArray();
		array.manualConversion();
		array.usingMethod();
	}
}
