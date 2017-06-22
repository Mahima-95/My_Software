package com.book.thread.practice;

public class CreateSleepThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (i % 10 != 0) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Run by " + Thread.currentThread().getName()
						+ ", i is " + i);
			}
		}
	}
}