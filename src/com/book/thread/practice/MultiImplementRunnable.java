package com.book.thread.practice;

public class MultiImplementRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("thread is running...");

	}

	public static void main(String[] args) {
		MultiImplementRunnable implementRunnable = new MultiImplementRunnable();
		Thread thread = new Thread(implementRunnable);
		thread.start();
	}

}
