package com.book.practice;

public class ThreadWithSleep {
	public static void main(String[] args) {
		Threadname threadname = new ThreadName();
		Thread one = new Thread(threadname);
	}
	
}

class Threadname implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 50; i++) {
			System.out.println("Run by" + Thread.currentThread().getName()
					+ ", i is " + i);
		}

	}

}
