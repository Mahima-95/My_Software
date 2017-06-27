package com.book.thread.practice;

public class ThreadWithRunMethod extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		ThreadWithRunMethod t1 = new ThreadWithRunMethod();
		t1.run();// fine, but does not start a separate call stack
	}
}

//it doesn't create a new stack to run thread'