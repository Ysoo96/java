package com.javateam.jse;

public class Ex_19 {

	public static void main(String[] args) {
		// for (int i = 1; i <= 10; i++) {
		// for (int i = 1; i < 11; i++) {
		// for (int i = 1; i < 11; ++i) {
		// for (int i = 1; i < 11; i = i + 1) {
		// for (int i = 1; i < 11; i += 1) {
		
		System.out.println("처음");
		
		for (int i = 10; i >= 1; i--) { // 1)의 경우
			
			System.out.println("반복");
			
			// System.out.print(i + " ");
			System.out.print(11 - i + " "); // 1)의 경우 (증가 형태)
		}
		
		System.out.println("끝");
	}

}
