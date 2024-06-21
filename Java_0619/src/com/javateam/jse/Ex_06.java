package com.javateam.jse;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {

		// 점수(0 ~ 100) => 학점(A ~ F)
		// 점수 : score
		// 학점 : credit
		// A : 90 ~ 100
		// B : 80 ~ 89
		// C : 70 ~ 79
		// D : 60 ~ 69
		// F : 0 ~ 59

		// 입력부
		System.out.print("점수 입력 : ");
		Scanner sc = new Scanner(System.in);

		// 점수
		// int score = 80;
		int score = sc.nextInt(); // 정수만 입력

		// 학점
		char credit = 'F';

		// 원래의 입력 점수 보관 => 출력시 활용
		int originalScore = score;
		// score = score / 10;
		score /= 10;

		// switch ~ case
		switch (score) {

		// case 10 : credit = 'A'; break;
		case 10:
		case 9:
			credit = 'A';
			break;
		case 8:
			credit = 'B';
			break;
		case 7:
			credit = 'C';
			break;
		case 6:
			credit = 'D';
			break;
		default:
			credit = 'F';
			break;
		}

		// ex) 80점은 B학점입니다.
		System.out.printf("%d점은 %s학점입니다.", originalScore, credit);

		// 표준 입력 자원 반납
		sc.close();
	}

}
