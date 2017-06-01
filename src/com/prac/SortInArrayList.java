package com.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortInArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Mahima");
		arrayList.add("Agrawal");
		arrayList.add("Shastri Nagar");
		arrayList.add("Delhi");
		Collections.sort(arrayList);
		Iterator<String> res = arrayList.iterator();
		while (res.hasNext()) {
			System.out.println(res.next());
		}
	}
}
