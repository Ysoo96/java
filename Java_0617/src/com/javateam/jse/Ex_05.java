package com.javateam.jse;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// System.out.print("a\n\n");
		//System.out.print("b");

		// 포멧(형식) 문자열 문법
		// :https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Formatter.html#syntax
		// System.out.printf("%d월 %d일 %s 수업시간%n", 6, 17, "자바");

		System.out.print("문자열 입력 : ");
		// 표준 입력
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println("str : " + str);
	}

}
