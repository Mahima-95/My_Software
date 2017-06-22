package com.book.practice;

public class ThreadName implements Runnable{
		@Override
		public void run() {
			for (int i = 0; i <= 50; i++) {
				System.out.println("Run by" + Thread.currentThread().getName()
						+ ", i is " + i);
			}

		}

}
