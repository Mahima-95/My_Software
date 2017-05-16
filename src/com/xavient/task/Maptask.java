package com.xavient.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Maptask {
	String ch;
	Scanner sc, sc1;
	List<Integer> list = null;
	Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();

	public void input() {
		do {
			System.out.println("Enter name");
			sc = new Scanner(System.in);
			String name = sc.next();
			System.out.println("Enter numbers to be enter ? ");
			int limit = sc.nextInt();
			list = new ArrayList<Integer>();
			for (int i = 1; i <= limit; i++) {
				System.out.println("Enter " + i + " number");
				list.add(sc.nextInt());
			}
			map.put(name, list);
			System.out
					.println("Do you want to enter any other name press y/Y ???");
			ch = sc.next();
		} while (ch.equalsIgnoreCase("y"));
		GetValues();
	}

	public Map<String, List<Integer>> GetValues() {
		System.out.println("name??");
		String name = sc.next();
		if (!map.isEmpty() && map.containsKey(name)) {
			List<Integer> lists = map.get(name);
			lists.forEach(integer -> System.out.println(integer));
		}
		return null;
	}

	public static void main(String[] args) {
		Maptask maptask = new Maptask();
		maptask.input();
	}
}
