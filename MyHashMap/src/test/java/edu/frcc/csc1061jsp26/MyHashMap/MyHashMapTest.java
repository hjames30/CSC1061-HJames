package edu.frcc.csc1061jsp26.MyHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new MyHashMap<>();
		
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
		map.put("4", 4);
		map.put("5", 5);
		printMap(map);
		System.out.println("After removing 3");
		map.remove("3");
		printMap(map);
		System.out.println("After clearing map");
		map.clear();
		
		
		
	}
	public static void printMap(Map pmap) {
		Set<Map.Entry<String, Integer>> entries = pmap.entrySet();
		
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.println("(" + entry.getKey() + ", " + entry.getValue()+")");
		}
	}
}
