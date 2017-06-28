package com.book.thread.practice;

public class TestThreads1 {
	public static void main(String[] args) {
		Thread t = new MyThread111() {
			public void run() {
				System.out.print(" foo");
			}
		};
		t.start();
	}
}

class MyThread111 extends Thread {
	MyThread111() {
		System.out.print(" MyThread");
	}

	public void run() {
		System.out.print(" bar");
	}

	public void run(String s) {
		System.out.print(" baz");
	}
}