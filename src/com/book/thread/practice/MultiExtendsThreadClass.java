package com.book.thread.practice;

public class MultiExtendsThreadClass extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {
		MultiExtendsThreadClass multi = new MultiExtendsThreadClass();
		multi.start();
	}

}
