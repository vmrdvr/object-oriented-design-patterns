package com.ravi.server;

import java.util.HashMap;
import java.util.Map;

public class MusicLyrics {

	public static void compare(String s1, String s2) {

		String[] sArr1 = s1.split(" ");
		String[] sArr2 = s2.split(" ");
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map1 = count(sArr1);
		map2 = count(sArr2);
		for (String s : map1.keySet()) {
			if (map2.containsKey(s)) {
				map.put(s, map1.get(s) + map2.get(s));
				map2.remove(s);
			} else {
				map.put(s, map1.get(s));
			}
		}
		for (String s : map2.keySet()) {
			map.put(s, map2.get(s));
		}
		
		System.out.println(map);
	}

	static Map<String, Integer> count(String[] sArr) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String s : sArr) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		return map;
	}

	public static void main(String[] args) {

		String s1 = "hello my name hello hello is ravi";

		String s2 = "ravi this is his hello name";
		compare(s1, s2);

	}
}
