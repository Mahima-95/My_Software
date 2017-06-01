package com.collection.prac;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPrac {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("H");
		linkedList.add("I");
		linkedList.add("M");
		linkedList.addFirst("M");
		linkedList.addLast("A");
		linkedList.add(1, "A");
		System.out.println("Original list:-" + linkedList);

		linkedList.remove("H");
		linkedList.remove(2);
		System.out.println("After removing 2 letters:-" + linkedList);

		// linkedList.removeFirst();
		linkedList.removeFirst();
		System.out.println("After removing First:-" + linkedList);

		Object object = linkedList.get(2);
		linkedList.set(2, object + "Hello");
		System.out
				.println("After Get and Set value in index 2 :-" + linkedList);

		System.out.println("Size of linked list:-" + linkedList.size());
		System.out.println("first element:-" + linkedList.getFirst());
		System.out.println("last element:-" + linkedList.getLast());
		System.out.println("first index element:-" + linkedList.get(1));
		
		Iterator<String> iterator = linkedList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
