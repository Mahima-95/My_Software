package com.mahi.arraysofobjectreferences;

public class Autoboxing {

	public void test() {
		Integer integer = new Integer(555);
		int x = integer.intValue();
		x++;
		integer = new Integer(x);
		System.out.println(integer);

		Integer integer1 = new Integer(555);
		integer1++;
		System.out.println(integer1);
	}

	public void test1() {
		Integer i = 556;
		Integer j = i;
		System.out.println(i == j);
		i++;
		System.out.println(j + " equals " + i);
		System.out.println(i == j);

		int i2 = j.intValue();
		i2++;
		j = new Integer(i2);
		System.out.println(j);
	}

	public static void main(String[] args) {
		Autoboxing autoboxing = new Autoboxing();
		autoboxing.test();
		autoboxing.test1();
	}
}
