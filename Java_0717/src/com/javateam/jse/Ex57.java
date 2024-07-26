package com.javateam.jse;

import java.util.LinkedList;
import java.util.Queue;

public class Ex57 {

	public static void main(String[] args) {

		// FIFO (선입선출)
		Queue<String> qu = new LinkedList<>();
		qu.offer("카리나");
		qu.offer("윈터");
		qu.offer("닝닝");
		qu.offer("지젤");
		
		System.out.println(qu.size());

		System.out.println(qu.poll());
		System.out.println(qu.size());
		
		System.out.println(qu.poll());
		System.out.println(qu.size());
		
		System.out.println(qu.poll());
		System.out.println(qu.size());
		
		System.out.println(qu.poll());
		System.out.println(qu.size());


	}

}
