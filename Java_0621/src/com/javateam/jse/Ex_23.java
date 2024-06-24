package com.javateam.jse;

public class Ex_23 {

	public static void main(String[] args) {

		System.out.println("처음");

		int i = 1;

		for (;; ++i) { // 조건식(한계치) 없으면 무한 반복 (infinite loop)

//			if (i <= 10) {
//				System.out.print(i + " ");
//			} else {
//				break;
//			}
				
				if (i == 11) break; // 조건 분기
			
				System.out.print(i + " ");

			// if (i == 10) break;
		}

		// System.out.println(i);
		// System.out.println("끝");
	}

}
