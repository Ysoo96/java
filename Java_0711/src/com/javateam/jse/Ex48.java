package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex48 {

	public static void main(String[] args) {

		// List list = new ArrayList(); // raw type(요소의 타입 미지정)
		// List<String> list 
		//	= new ArrayList<String>(); // 요소 타입 지정(제네릭스)
		// 제네릭스 => 자료형 제한 : 성능 향상
		List<String> list = new ArrayList<>();
		// list.add(1); // (X)
		// list.add(1.0); // (X)
		// 요소 추가
		list.add("java");
		list.add("spring");
		list.add("spring");
		
		list.addAll(Arrays.asList("jsp", "servlet", "html", "css"));
		list.addAll(Arrays.asList(new String[] {"bootstrap", "javascript"}));
		
		System.out.println("요소의 갯수 : " + list.size());
		
		// 요소 조회
		// System.out.println("첫번째 : " + list.get(0));
		// System.out.println("마지막 요소 : " + list.get(list.size() - 1));
		
		// 전체 조회
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i) + " ");
//		}
		
//		System.out.println();
		
//		for (String s : list) {
//			System.out.print(s + " ");
//		}
//		
//		System.out.println();
		
		// 인자 : 함수형 인터페이스 => 람다대수 함수(기호식 프로그램)
		// (람다대수)함수형 프로그래밍
		// list.forEach(x -> System.out.print(x + " "));
//		list.forEach(System.out::println);
//		
//		System.out.println();
		
		// 일부 조회 : 0 ~ 2 (3은 미포함)
		// list.subList(0, 3)
		// list.subList(1, 4)
		//	.forEach(x -> System.out.print(x + " "));
		
		// 정렬(ordering, sorting)
		// 오름차순 : (인코딩)코드순 <-> 역순 (내림차순)
		// list.sort(Comparator.naturalOrder());
		// list.sort(Comparator.reverseOrder()); // 내림차순 정렬
		
		// Collections.sort(list); // 오름차순
		// Collections.sort(list, Comparator.naturalOrder());
		Collections.sort(list, Comparator.reverseOrder()); // 내림차순
		/*
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// int result = o1.compareTo(o2);
				// System.out.println("result : " + result);
				// return result;
				// return o1.compareTo(o2); // 오름차순
				return o2.compareTo(o1); // 내림차순
			}
			
		}); */
		
//		Collections.sort(list, (o1, o2) -> o1.compareTo(o2)); // 오름차순
//		Collections.sort(list, (o1, o2) -> o2.compareTo(o1)); // 내림차순
		
//		list.forEach(x -> System.out.print(x + " "));
//		System.out.println();
		
		////////////////////////////////////////////////
		
		// list.stream()
		list.parallelStream() // 병렬 처리
			// .sorted() // 오름차순 정렬
			// .sorted(Comparator.reverseOrder()) // 내림차순 정렬
			.sorted((o1, o2) -> o2.compareTo(o1)) // 내림차순 정렬
			.forEach(x -> System.out.print(x + " "));
		
	} //	

}