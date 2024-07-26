package com.javateam.jse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Ex55 {
	public static void main(String[] args) {

		// Map<String, String> map = new HashMap<>();
		// Map<String, String> map = new TreeMap<>();
		NavigableMap<String, String> map = new TreeMap<>();
		map.put("장충", "족발");
		map.put("종로", "닭한마리");
		map.put("종로", "설렁탕");
		map.put("신림", "순대");
		map.put("을지로", "골뱅이");
		map.put("을지로", "고갈비");
		map.put("응암", "감자탕");
		map.put("신당", "떡볶이");
		map.put("마포", "돼지갈비");

		// map.keySet(); // key들로만 구성 set
		// 값(들)으로만 구성
		// map.values().forEach(x -> System.out.print(x + " "));
		// map.entrySet().forEach(System.out::println);

		// 내림차순 정렬
		// map.descendingKeySet().forEach(System.out::println);
		// map.descendingMap().entrySet().forEach(System.out::println);
		
		map.subMap("신림", "한남").entrySet().forEach(System.out::println);

	}
}
