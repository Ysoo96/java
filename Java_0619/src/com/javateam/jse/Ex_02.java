package com.javateam.jse;

public class Ex_02 {

	public static void main(String[] args) {
		// 점수(0 ~ 100) => 학점(A ~ F)
		// 점수 : score
		// 학점 : credit
		// A : 90 ~ 100
		// B : 80 ~ 89
		// C : 70 ~ 79
		// D : 60 ~ 69
		// F : 0 ~ 59

		// 점수
		int score = 80;
		// 학점
		char credit = 'F';

		// A : 90 ~ 100
		// if (90 <= score && score <= 100) {
		if (score >= 90 && score <= 100) {
			credit = 'A';
		}
		// B : 80 ~ 89
		else if (score >= 80 && score <= 89) {
			credit = 'B';
		}
		// C : 70 ~ 79
		else if (score >= 70 && score <= 79) {
			credit = 'c';
		}
		// D : 60 ~ 69
		else if (score >= 60 && score <= 69) {
			credit = 'D';
		}
		// F : 0 ~ 59
		// else if (score >= 0 && score <= 59) {
		else {
			credit = 'F';
		}

		// ex) 80점은 B학점입니다.
		// System.out.println(score + "점은 " + credit + "학점입니다.");
		// 형식자(format)
		// :
		// https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Formatter.html#syntax
		// System.out.printf("%d점은 %c학점입니다.", score, credit);
		System.out.printf("%d점은 %s학점입니다.", score, credit);
	}

}
