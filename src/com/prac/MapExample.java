package com.prac;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("Enter key and values");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i <= 9; i++) {
			map.put(scanner.nextInt(), scanner.next());
		}
		System.out.println(map);

	}
}
