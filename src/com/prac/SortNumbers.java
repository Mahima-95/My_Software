package com.prac;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortNumbers {

	public static <K, V> void printMap(Map<K, V> map1) {
		for (Map.Entry<K, V> entry : map1.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
					+ entry.getValue());
		}
	}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("2", "froyo");
		map.put("3", "abby");
		map.put("6", "denver");
		map.put("9", "frost");
		map.put("1", "daisy");
		System.out.println("Unsort Map......");
		printMap(map);

		// for (Map.Entry<String, String> entry : map.entrySet()) {
		// System.out.println("Key:-" + entry.getKey() + "  Value:-"
		// + entry.getValue());
		// }
		
		 System.out.println("\nSorted Map......By Key");
		 TreeMap<String, String> treeMap = new TreeMap<String, String>(map);
		 printMap(treeMap);
	}
}
