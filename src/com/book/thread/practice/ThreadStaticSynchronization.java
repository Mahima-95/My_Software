package com.book.thread.practice;

public class ThreadStaticSynchronization {
	synchronized static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}

class MyThread1 extends Thread {
	public void run() {
		ThreadStaticSynchronization.printTable(1);
	}
}

class MyThread2 extends Thread {
	public void run() {
		ThreadStaticSynchronization.printTable(10);
	}
}

class MyThread3 extends Thread {
	public void run() {
		ThreadStaticSynchronization.printTable(100);
	}
}

class MyThread4 extends Thread {
	public void run() {
		ThreadStaticSynchronization.printTable(1000);
	}
}
