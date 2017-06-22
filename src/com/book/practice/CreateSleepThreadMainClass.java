package com.book.practice;

public class CreateSleepThreadMainClass {
	public static void main(String[] args) {
		CreateSleepThread createSleepThread = new CreateSleepThread();
		Thread one = new Thread(createSleepThread);
		one.setName("Mahima");
		Thread two = new Thread(createSleepThread);
		two.setName("Agrawal");
		Thread three = new Thread(createSleepThread);
		three.setName("New Delhi");
		one.start();
		two.start();
		three.start();
	}
}
