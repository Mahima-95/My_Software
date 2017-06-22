package com.book.practice;

public class ThreadWithSleep {
	public static void main(String[] args) {
		NameThread threadname = new NameThread();
		Thread one = new Thread(threadname);
		one.setName("Mahima");
		Thread two = new Thread(threadname);
		two.setName("Agrawal");
		Thread three = new Thread(threadname);
		three.setName("New Delhi");
		one.start();
		two.start();
		three.start();
	}
}
/*Still, using  sleep()
is the best way to help all threads get a chance to run!
Remember that  sleep() is a static method, so don't be fooled into thinking that
one thread can put another thread to sleep.
 */