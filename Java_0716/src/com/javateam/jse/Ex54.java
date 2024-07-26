package com.javateam.jse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex54 {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("신림", "순대");
		map.put("종로", "닭한마리");
		map.put("종로", "설렁탕");
		map.put("을지로", "골뱅이");
		map.put("을지로", "고갈비");
		map.put("장충", "족발");
		map.put("응암", "감자탕");
		map.put("신당", "떡볶이");

		// key의 중복 배제
		System.out.println("map의 크기 : " + map.size());

		// 개발 요소 조회
		System.out.println(map.get("을지로"));

		// 전제 요소 조회
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			Entry<String, String> entry = it.next();
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + "=" + val);
		}
		System.out.println("--------------------------------------");

		// map.entrySet().forEach(x -> System.out.println(x));
		// map.entrySet().forEach(System.out::println);
		// map.keySet().forEach(k -> System.out.println(k + "=" + map.get(k)));
		map.forEach((k, v) -> System.out.println(k + "=" + v));

	}
}
