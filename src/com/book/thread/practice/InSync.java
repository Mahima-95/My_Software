package com.book.thread.practice;

public class InSync extends Thread {

	StringBuffer buffer;

	public InSync(StringBuffer buffer) {
		super();
		this.buffer = buffer;
	}

	public void run() {
		synchronized (buffer) {
			for (int i = 0; i < 100; i++) {
				System.out.println(buffer);
			}
			System.out.println();
			char temp = buffer.charAt(0);
			temp++;
			buffer.setCharAt(0, temp);
		}
	}

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("A");
		new InSync(stringBuffer).start();
		new InSync(stringBuffer).start();
		new InSync(stringBuffer).start();
	}
}
