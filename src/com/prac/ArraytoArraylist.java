package com.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraytoArraylist {
	public static void main(String[] args) {
		String[] names = { "Agra", "Mysore", "Chandigarh", "Bhopal" };
		ArrayList<String> arrayList = new ArrayList<String>(
				Arrays.asList(names));
		arrayList.add("New");

		for (String temp : arrayList)
			System.out.println(temp);

		// another way to convert arrays to array list is given below but in
		// this case no need to do Arrays.asList(names) this:-
		Collections.addAll(arrayList, names);
		arrayList.add("Newest");
		for (String temp : arrayList)
			System.out.println(temp);

		// Manually convert arrays to array list
		System.out.println("Manually convert arrays to array list");
		ArrayList<String> arrays = new ArrayList<String>();
		String[] str = { "hi", "hello", "hey" };
		for (int i = 0; i < str.length; i++) {
			arrays.add(str[i]);
		}
		arrays.add("Mahima");
		for (String temp : arrays) {
			System.out.println(temp);
		}
	}
}
