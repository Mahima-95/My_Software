package com.book.thread.practice;

public class ThreadPriorities extends Thread {
	public void run() {
		System.out.println("running thread name is:"
				+ Thread.currentThread().getName());
		System.out.println("running thread priority is:"
				+ Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		ThreadPriorities m1 = new ThreadPriorities();
		ThreadPriorities m2 = new ThreadPriorities();
		ThreadPriorities m3 = new ThreadPriorities();
		m1.setPriority(MIN_PRIORITY);
		m2.setPriority(MAX_PRIORITY);
		m3.setPriority(NORM_PRIORITY);
		m1.start();
		m2.start();
		m3.start();
	}
}
