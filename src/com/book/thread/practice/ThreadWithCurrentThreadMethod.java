package com.book.thread.practice;

public class ThreadWithCurrentThreadMethod extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadWithCurrentThreadMethod t1 = new ThreadWithCurrentThreadMethod();
		ThreadWithCurrentThreadMethod t2 = new ThreadWithCurrentThreadMethod();
		t1.start();
		t2.start();
	}
}
