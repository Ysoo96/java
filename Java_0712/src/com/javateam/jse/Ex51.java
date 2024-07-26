package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex51 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		// 요소 추가
		list.add("java");
		list.add("spring");
		list.add("spring");

		list.addAll(Arrays.asList("jsp", "servlet", "html", "css"));
		list.addAll(Arrays.asList(new String[] { "bootstrap", "javascript" }));

		List<String> list2
		// = List.of("jsp", "servlet", "html", "css");
		// = Arrays.asList("jsp", "servlet", "html", "css");
		// = Arrays.asList("mybatis", "JPA");
				= Arrays.asList("mybatis", "JPA", "html", "css");

		// 예외 발생 : 불변(immutable) 리스트 객체
		// 캡슐화
		// java.lang.UnsupportedOperationException
		// list2.add("mybatis"); // X
		// list2.remove(0); // X
		// list2.add(1, "mybatis"); // X

		// System.out.println(list2.get(0));

		// list.retainAll(list2); // 공통 요소 -> 교집합
		// list.forEach(x -> System.out.print(x + " "));

		// 배열로 역치환
		String[] strArr = new String[list.size()];
		strArr = list.toArray(strArr);

		// 배열 <-> 배열 : () 연산자 치환 X
		// 예외 발생 : java.lang.ClassCastException
		// Object[] objArr = new Object[list.size()];
		// String strArr[] = (String[])list.toArray();

		System.out.println("배열의 첫요소 : " + strArr[1]);

		list = list.stream().distinct().toList(); // 리스트에서 중복 제거
		System.out.println(list.size());

	}

}