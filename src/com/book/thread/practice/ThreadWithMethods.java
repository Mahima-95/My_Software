package com.book.thread.practice;

public class ThreadWithMethods extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String[] args) {
		ThreadWithMethods t1 = new ThreadWithMethods();
		ThreadWithMethods t2 = new ThreadWithMethods();
		System.out.println("Name of t1:" + t1.getName());
		System.out.println("Name of t2:" + t2.getName());
		System.out.println("id of t1:" + t1.getId());
		t1.start();
		t2.start();
		t1.setName("Sonoo Jaiswal");
		System.out.println("After changing name of t1:" + t1.getName());
	}
}
