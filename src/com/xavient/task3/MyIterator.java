package com.xavient.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyIterator {

	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("C++");
		list.add("Python");
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
