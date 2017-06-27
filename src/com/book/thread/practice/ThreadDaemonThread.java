package com.book.thread.practice;

public class ThreadDaemonThread extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {
		ThreadDaemonThread t1 = new ThreadDaemonThread();// creating thread
		ThreadDaemonThread t2 = new ThreadDaemonThread();
		ThreadDaemonThread t3 = new ThreadDaemonThread();
		t1.setDaemon(true);
		t1.start();
		/*
		 * if i do this t1.start(); t1.setDaemon(true);//will throw exception
		 * here
		 */
		t2.start();
		t3.start();
	}
}