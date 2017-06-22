package com.book.practice;

public class FooRunnable implements Runnable {

	@Override
	public void run() {
		for (int x = 1; x < 6; x++) {
			System.out.println("Runnable running");
		}
		System.out.println("NameRunnable running");
		System.out.println("Run by " + Thread.currentThread().getName());
	}
}
