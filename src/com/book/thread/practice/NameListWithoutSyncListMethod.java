package com.book.thread.practice;

import java.util.*;

public class NameListWithoutSyncListMethod {

	private List names = new LinkedList();

	public synchronized void add(String name) {
		names.add(name);
	}

	public synchronized String removeFirst() {
		if (names.size() > 0)
			return (String) names.remove(0);
		else
			return null;
	}

	public static void main(String[] args) {
		final NameListWithoutSyncListMethod nl = new NameListWithoutSyncListMethod();
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
 * Now the entire removeFirst() method is synchronized , and once one thread
 * starts it and calls names.size() , there's no way the other thread can cut in
 * and steal the last name. The other thread will just have to wait until the
 * first thread completes the removeFirst() method. The moral here is that just
 * because a class is described as "thread-safe" doesn't mean it is always
 * thread-safe. If individual methods are synchronized, that may not be
 * enough—you may be better off putting in synchronization at a higher level
 * (i.e., put it in the block or method that calls the other methods). Once you
 * do that, the original synchronization (in this case, the synchronization
 * inside the object returned by Collections.synchronizedList() ) may well
 * become redundant.
 */