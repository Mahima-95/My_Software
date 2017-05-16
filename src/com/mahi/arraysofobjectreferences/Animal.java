package com.mahi.arraysofobjectreferences;

public class Animal {
	static void eat() {
	}
}

class Dog3 extends Animal {
	public static void main(String[] args) {
		Dog3 d = new Dog3();
		d.go(d); // is this legal ?

		/*d.test(new Integer(5));*/
	}

	void test(Long x) {
	}

	void go(Animal a) {
	}
}
