package com.javateam.jse;

public class Ex_20 {

	public static void main(String[] args) {

		System.out.println("처음");

		// for (int i = 1; i <= 10; i = i + 2) { // 2씩 증가 (홀수)
		// for (int i = 1; i <= 10; i += 2) {
		// for (int i = 2; i <= 10; i += 2) { // 2씩 증가 (짝수)
		for (int i = 10; i >= 2; i -= 2) { // 2씩 감소 (짝수)

			// System.out.println("반복");
			// System.out.print(i + " ");
			System.out.print(12 - i + " ");
		}

		System.out.println("끝");
	}

}
