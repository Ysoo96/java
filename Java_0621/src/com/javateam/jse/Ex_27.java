package com.javateam.jse;

import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {

		// 구구단(times table) m ~ n단 출력
		System.out.print("시작단 입력 : ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();

		System.out.print("마침단 입력 : ");
		sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int j = m; j <= n; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d%n", j, i, j * i);
			}
			System.out.println();
		}

		sc.close(); // 입력 자원 반납
	}

}
