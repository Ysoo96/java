package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex53 {

	public static void main(String[] args) {

		// Set<String> set = new HashSet<>();
		// Set<String> set = new TreeSet<>(); // 오름차순 정렬
		NavigableSet<String> set = new TreeSet<>(); // 오름/내림차순 정렬

		// 요소 추가
		set.add("java");
		set.add("spring");
		set.add("spring");

		set.addAll(Arrays.asList("jsp", "servlet", "html", "css"));
		set.addAll(Arrays.asList(new String[] { "bootstrap", "javascript" }));

		set.remove("spring");
		System.out.println("set의 요소의 갯수 : " + set.size());

		// set = set.descendingSet(); // 내림차순 정렬 Set 으로 치환
		// set.forEach(x -> System.out.print(x + " "));

		Iterator<String> it = set.descendingIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		System.out.println();
		set.forEach(x -> System.out.print(x + " "));

		System.out.println();
		// 낱개 요소 조회 : 일부 허용
		System.out.println("첫 요소 : " + set.first());
		System.out.println("끝 요소 : " + set.last());

		// set.subSet("boot", "jsp").forEach(x -> System.out.print(x + " "));
		set.subSet("boot", true, "jsp", true).forEach(x -> System.out.print(x + " "));

		System.out.println();
		set.headSet("html", true).forEach(x -> System.out.print(x + " "));

		System.out.println();
		set.tailSet("html", false).forEach(x -> System.out.print(x + " "));

	}

}