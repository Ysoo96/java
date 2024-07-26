package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex49 {

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
		list.remove(0);
		// list.remove("spring");
		list.removeAll(Arrays.asList("spring", "css"));
		System.out.println("요소의 갯수 : " + list.size());
		
		list.forEach(x->System.out.print(x + " "));
		
	} //	

}