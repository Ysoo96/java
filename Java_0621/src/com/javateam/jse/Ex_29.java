package com.javateam.jse;

public class Ex_29 {

	public static void main(String[] args) {

		// 2 ~ 9단 구구단
		int i = 2; // 단
		int j = 1; // 서수
		while (i <= 9) { // 단
			while (j <= 9) { // 서수
				System.out.printf("%d X %d = %d%n", i, j, i * j);
				j++;
			}
			// System.out.println("j : " + j);
			j = 1; // 주의) 카운터 초기화 => ... 없다면 2단 출력
			System.out.println();
			i++;
		}
	}

}
