package com.xavient.stringbuffer;

public class Resulttest {

	public void t(){
		String a = "Wild";
		String b = " Irish";
		String c = " Rose";
		String result;
		result=a.concat(b.concat(c));
		System.out.println(result);
	}
	public void t1(){
		String a = "Wild";
		String b = a+"Irish";
		String abc = "WildIrish";
		System.out.println(b==abc);
	}
	public static void main(String[] args) {
		Resulttest resulttest = new Resulttest();
		resulttest.t();
		resulttest.t1();
	}
}
