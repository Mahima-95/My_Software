package com.book.thread.practice;

public class ThreadAndPutSleep extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			if (i % 10 == 0) {
				System.out.println("its result is 0");
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException exception) {
				System.out.println("InterruptedException");
			}
		}

	}

	public static void main(String[] args) {
		ThreadAndPutSleep count = new ThreadAndPutSleep();
		count.start();
	}
}

//Creating a Thread and Putting It to Sleep
