package com.javateam.jse;

public class Ex_24 {

	public static void main(String[] args) {

		System.out.println("처음");

		int i = 1;

		// for () { // 세미콜론을 제외하면 안됨
		for (;;) { // while (true) 동일한 표현

			if (i <= 10) {
				System.out.print(i + " ");
				i++;
			} else {
				break;
			}
				
				if (i == 11) break; // 조건 분기
			
				// System.out.print(i + " ");

			// if (i == 10) break;
		}

		// System.out.println(i);
		// System.out.println("끝");
	}

}
