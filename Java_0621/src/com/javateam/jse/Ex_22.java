package com.javateam.jse;

public class Ex_22 {

	public static void main(String[] args) {

		System.out.println("처음");

		// int i; // 1, 2)의 경우
		int i = 1; // 3)의 경우

		// for (i = 1; i <= 10; i++) { // 1)의 경우
		// for (i = 1; i <= 10; ++i) { // 2)의 경우
		for (; i <= 10; ++i) { // 3)의 경우
		// for (i <= 10; ++i) { // (X)

			System.out.print(i + " ");
		}

		// System.out.println(i);
		System.out.println("끝");
	}

}
