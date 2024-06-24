package com.javateam.jse;

import java.util.Scanner;

public class quiz_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		int student = 0;
		int scores[] = null;

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");
			
			int num = Integer.parseInt(sc.nextLine());

			if (num == 1) {
				System.out.print("학생수 > ");
				student = Integer.parseInt(sc.nextLine());
				scores = new int[student];
			} else if (num == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] > ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			} else if (num == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] > " + scores[i]);
				}
			} else if (num == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i])
						max = scores[i];
					sum += scores[i];
				}
				avg = (double) sum / student;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			} else if (num == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

}
