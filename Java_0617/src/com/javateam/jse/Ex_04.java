package com.javateam.jse;

public class Ex_04 {

	public static void main(String[] args) {
		int num1 = 1;
		
		// 지역 변수의 범위 지역성(범위 한계)
		{
			int num2 = 2;
			
			System.out.println("num1 : " + num1);
			System.out.println("num2 : " + num2);
		}

		System.out.println("num1 : " + num1);
		// System.out.println("num2 : " + num2);
	}

}
