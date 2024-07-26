package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex50 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		// 요소 추가
		list.add("java");
		list.add("spring");
		list.add("spring");
		
		list.addAll(Arrays.asList("jsp", "servlet", "html", "css"));
		list.addAll(Arrays.asList(new String[] {"bootstrap", "javascript"}));
		
		// 포함 여부
//		System.out.println("개별 포함 여부 : " 
//						+ list.contains("스프링"));
		//System.out.println("집체적 요소 포함 여부 : " 
		// + list.containsAll(Arrays.asList("spring", "css")));
		
		// 요소의 삭제
		// list.clear();
		// list.remove(0);
		// list.remove("spring");
		// list.removeAll(Arrays.asList("spring", "css"));
		// System.out.println("요소의 갯수 : " + list.size());
		
		//list.forEach(x->System.out.print(x + " "));
		
		// index
		// System.out.println("'spring' index :" + list.indexOf("spring"));
		
		// (외부) 반복자 패턴 적용 => 다량 검색 성능 향상
		// "다음" 요소 검색 방식
		// foreach loop / forEach 메소드
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		// 역순 나열
		ListIterator<String> lit 
			= list.listIterator(list.size());
		while (lit.hasPrevious()) {
			System.out.print(lit.previous() + " ");
		}
		
	} //	

}