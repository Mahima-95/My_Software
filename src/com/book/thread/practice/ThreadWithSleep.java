package com.book.thread.practice;

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



/*yes i meet with khalid and take knowledge about the framework development work and i don't feel enough development work there so i am not interested 
if any java related work there then please let me know*/

/*Hi Sir,

I am willing to work on this opportunity provided if there will good project on java then we will moved to my major java project only development.

*/