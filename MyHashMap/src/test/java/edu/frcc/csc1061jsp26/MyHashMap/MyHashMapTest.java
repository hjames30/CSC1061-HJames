package edu.frcc.csc1061jsp26.MyHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
		map.put("4", 4);
		map.put("5", 5);
		System.out.println(map.toString());
		map.remove("3");
		System.out.println(map.toString());
		map.clear();
		System.out.println(map);
		
		printMap(map);
		
	}
	public static void printMap(Map pmap) {
		Set<Map.Entry<String, Integer>> entries = pmap.entrySet();
		
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.println("(" + entry.getKey() + ", " + entry.getValue()+")");
		}
	}
}
