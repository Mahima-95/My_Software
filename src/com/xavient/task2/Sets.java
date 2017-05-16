package com.xavient.task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sets {

	Scanner sc = new Scanner(System.in);
	public void Input(){
		
	Set<Integer> set = new HashSet<Integer>();
	
	System.out.println("Enter numbers");
	int num = sc.nextInt();
	for(int i=1; i<=num; i++){
		System.out.println("Enter" +i+ "number");
		set.add(sc.nextInt());
	}
	System.out.println(set);
	}
	
	public static void main(String[] args) {
		Sets sets = new Sets();
		sets.Input();
	}
	
}
