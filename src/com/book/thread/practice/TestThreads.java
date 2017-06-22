package com.book.thread.practice;

import com.book.practice.FooRunnable;

public class TestThreads {
	public static void main(String[] args) {
		FooRunnable fooRunnable = new FooRunnable();
		Thread thread = new Thread(fooRunnable);
		//thread.setName("Mahima");
		thread.start();
		//System.out.println("Thread is " +Thread.currentThread().getName());
	}
}
