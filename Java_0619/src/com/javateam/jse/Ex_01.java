package com.javateam.jse;

public class Ex_01 {

	public static void main(String[] args) {
		// if (true) { // 무조건 실행
//		if (else) { // dead code : 무조건 실행 안됨
//				System.out.println("무조건 실행");
//		}

		int num1 = 6;
		int num2 = 19;
		// if (1) { // X
		// if ("1") { // X
		// if (num1 < num2) {
		// if (num1 <= num2) {
		// if (num1 < num2 || num1 == num2) {
		// if ((num1 < num2) || (num1 == num2)) {
		// if (!(num1 > num2)) { // 이중 부정 (not) = 긍정
		// if (!!(num1 <= num2)) {
		// if (!!(num1 < num2 || num1 == num2)) {
		if (!(num1 < num2 && num1 != num2)) {
			System.out.println("실행");
		} else { // 기타 등등 (그외의 다른 용도)
			System.out.println("그외의 경우 실행");
		}
	}
}
