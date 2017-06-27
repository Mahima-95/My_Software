package com.book.thread.practice;

public class ThreadWithStartMethod extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		ThreadWithRunMethod t1 = new ThreadWithRunMethod();
		t1.start();// fine, but does not start a separate call stack
	}

}
// it creates a new stack to start thread