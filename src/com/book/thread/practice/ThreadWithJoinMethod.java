package com.book.thread.practice;

public class ThreadWithJoinMethod extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ThreadWithJoinMethod t1 = new ThreadWithJoinMethod();
		ThreadWithJoinMethod t2 = new ThreadWithJoinMethod();
		ThreadWithJoinMethod t3 = new ThreadWithJoinMethod();
		t1.start();
		try {
			t1.join(); // it prints first with joining
//			t1.join(1500); // it also prints first with joining but with time
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}
}
