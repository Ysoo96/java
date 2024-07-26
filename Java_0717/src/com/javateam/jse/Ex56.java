package com.javateam.jse;

import java.util.Stack;

public class Ex56 {

	public static void main(String[] args) {

		// LIFO (후입선출)
		Stack<String> stack = new Stack<>();
		stack.push("민지");
		stack.push("다니엘");
		stack.push("하니");
		
		System.out.println(stack.size());

		System.out.println(stack.pop());
		System.out.println(stack.size());

		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.size());

	}

}
