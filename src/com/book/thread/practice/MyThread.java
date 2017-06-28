package com.book.thread.practice;

public class MyThread {
	public static void main(String [] args) {
		printAll(args);
	}

	public static void printAll(String[] lines) {
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
			//Thread.currentThread().sleep(1000);
 } } 
}
/*A. Each String in the array  lines will print, with exactly a 1-second pause between lines
B. Each String in the array  lines will print, with no pause in between because this method is
not executed in a Thread
C. Each String in the array  lines will print, and there is no guarantee there will be a pause
because  currentThread() may not retrieve this thread
D. This code will not compile
E. Each String in the  lines array will print, with at least a one-second pause between lines*/