package com.xavient.task4;

public class D {

	public void test(Object a1){
		
		if(a1 instanceof C){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
	public static void main(String[] args) {
		D d = new D();
		B b = new B();
		Instanceoftask instanceoftask = new Instanceoftask();
		d.test(instanceoftask);
	}
}
