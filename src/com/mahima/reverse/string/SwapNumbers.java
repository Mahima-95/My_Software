package com.mahima.reverse.string;

import java.util.Scanner;

public class SwapNumbers {

	Scanner scanner = new Scanner(System.in);
	public void swap(){
		System.out.println("Enter two numbers");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println("x value is :" +x);
		System.out.println("y value is :" +y);
		x = x+y;
		y=x-y;
		x=x-y;
		System.out.println("x value is :" +x);
		System.out.println("y value is :" +y);
	}
	public static void main(String[] args) {
		SwapNumbers swapNumbers = new SwapNumbers();
		swapNumbers.swap();
	}
}
