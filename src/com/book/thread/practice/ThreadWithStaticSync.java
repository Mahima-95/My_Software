package com.book.thread.practice;

public class ThreadWithStaticSync {
	private static int staticField;
	private int nonstaticField;

	public static synchronized int getStaticField() {
		return staticField;
	}

	public static synchronized void setStaticField(int staticField) {
		ThreadWithStaticSync.staticField = staticField;
	}

	public synchronized int getNonstaticField() {
		return nonstaticField;
	}

	public synchronized void setNonstaticField(int nonstaticField) {
		this.nonstaticField = nonstaticField;
	}
}
