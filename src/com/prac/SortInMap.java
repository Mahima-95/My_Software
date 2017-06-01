package com.prac;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortInMap {

	public static <K, V> void printMap(Map<K, V> map1) {
		for (Map.Entry<K, V> entry : map1.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
					+ entry.getValue());
		}
	}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("bbb", "froyo");
		map.put("ccc", "abby");
		map.put("sss", "denver");
		map.put("aaa", "frost");
		map.put("eee", "daisy");
		System.out.println("Unsort Map......");
		// printMap(map);
		System.out.println(map);

		System.out.println("\nSorted Map......By Key");
		TreeMap<String, String> treeMap = new TreeMap<String, String>(map);
		// printMap(treeMap);
		System.out.println(treeMap);
	}
}
