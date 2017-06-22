package com.book.thread.practice;

public class NameThread implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <= 50; i++) {
			System.out.println("Run by " + Thread.currentThread().getName()
					+ ", i is " + i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}

	}

}
