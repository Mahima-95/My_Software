package com.book.practice;

public class ManyNames {
	public static void main(String[] args) {
		NameRunnable nameRunnable = new NameRunnable();
		Thread one = new Thread(nameRunnable);
		Thread two = new Thread(nameRunnable);
		Thread three = new Thread(nameRunnable);
		one.setName("Mahima");
		two.setName("Agrawal");
		three.setName("New Delhi");
		one.start();
		two.start();
		three.start();
		one.start();//java.lang.IllegalThreadStateException if i start same thread again it generates that exception in run time
	}
}

class NameRunnable implements Runnable {
	public void run() {
		for (int x = 1; x <= 100; x++) {
			System.out.println("Run by " + Thread.currentThread().getName()
					+ ", Thread Id " + Thread.currentThread().getId() +", x is " + x);
		}
	}
}

/*Each thread will start, and each thread will run to completion
 * A thread is done being a thread when its target  run() method completes.
 * Once a thread has been started, it can never be started again.
 * we've seen three thread states: new, runnable, and dead.
 * */


/*Methods from the java.lang.Thread Class
Some of the methods that can help us influence thread scheduling are as follows:
public static void sleep(long millis) throws InterruptedException
public static void yield()
public final void join() throws InterruptedException
public final void setPriority(int newPriority)
Note that both  sleep() and join() have overloaded versions not shown here.
*/


/*Methods from the java.lang.Object Class Every class in Java inherits the
following three thread-related methods:
public final void wait() throws InterruptedException
public final void notify()
public final void notifyAll()
The  wait() method has three overloaded versions (including the one listed here).
We'll look at the behavior of each of these methods in this chapter. First, though,
we're going to look at the different states a thread can be in.
*/



