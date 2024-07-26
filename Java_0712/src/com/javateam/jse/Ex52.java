package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex52 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		// 요소 추가
		set.add("java");
		set.add("spring");
		set.add("spring");

		set.addAll(Arrays.asList("jsp", "servlet", "html", "css"));
		set.addAll(Arrays.asList(new String[] { "bootstrap", "javascript" }));

		set.remove("spring");
		System.out.println("set의 요소의 갯수 : " + set.size());

//		for (String s : set) {
//			System.out.print(s + " ");
//		}

		// set.forEach(x -> System.out.print(x + " "));

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			System.out.print(s + " ");
		}
	}

}