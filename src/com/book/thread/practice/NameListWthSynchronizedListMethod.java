package com.book.thread.practice;

import java.util.*;

public class NameListWthSynchronizedListMethod {
	private List names = Collections.synchronizedList(new LinkedList());

	public void add(String name) {
		names.add(name);
	}

	public String removeFirst() {
		if (names.size() > 0)
			return (String) names.remove(0);
		else
			return null;
	}

	public static void main(String[] args) {
		final NameListWthSynchronizedListMethod nl = new NameListWthSynchronizedListMethod();
		nl.add("Ozymandias");
		class NameDropper extends Thread {
			public void run() {
				String name = nl.removeFirst();
				System.out.println(name);
			}
		}
		Thread t1 = new NameDropper();
		Thread t2 = new NameDropper();
		t1.start();
		t2.start();
	}
}

/*
 * Thread t1 executes names.size() , which returns 1. Thread t1 executes
 * names.remove(0) , which returns Ozymandias . Thread t2 executes names.size(),
 * which returns 0. Thread t2 does not call remove(0)
 */

// The method Collections.synchronizedList() returns a List whose methods
// are all synchronized and "thread-safe"
