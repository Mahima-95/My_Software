package com.mahi.arraysofobjectreferences;

public class PracticeForWrappers {
	Integer integer = Integer.valueOf("10100", 2);

	public void test() {
		System.out.println(integer);

		Integer inte = new Integer(5);
		byte b = inte.byteValue();
		System.out.println(b);

		Float float1 = new Float(22.2);
		byte c = float1.byteValue();
		System.out.println(c);
	}

	public void test1() {
		double double1 = Double.parseDouble("3.14");
		double double2 = Double.valueOf(3.14);
		System.out.println(double1);
		System.out.println(double2);
		
		
		String string = Integer.toHexString(254);
		System.out.println(string);
	}

	public static void main(String[] args) {
		PracticeForWrappers forWrappers = new PracticeForWrappers();
		forWrappers.test1();
	}
}
