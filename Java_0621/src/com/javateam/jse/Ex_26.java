package com.javateam.jse;

public class Ex_26 {

	public static void main(String[] args) {

		// 구구단(times table) 1 ~ 9단 출력
		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d%n", j, i, j * i);
			}
			System.out.println();
		}
	}

}
