package com.javateam.jse;

public class Ex_21 {

	public static void main(String[] args) {

		System.out.println("처음");

		// for (float i = 1; i <= 10; i++) { // 카운터(counter) 실수 가능
		// for (float i = 1; i <= 10; i += 0.5) {
		// for (float i = 0; i <= 10; i += 2.5f) { 
		// for (float i = 0.0; i <= 10.0; i += 2.5d) { // 카운터 변수 초기화(float <--- double X)
		for (float i = (float)0.0; i <= 10.0; i += 2.5d) { // 카운터 변수 초기화(float <--- double O)

			// System.out.println("반복");
			System.out.print(i + " ");
		}

		System.out.println("끝");
	}

}
