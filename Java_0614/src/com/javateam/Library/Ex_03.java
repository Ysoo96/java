package com.javateam.Library;

public class Ex_03 {

	public static void main(String[] args) {
		byte num1 = 1;
		// num1 = 128; // byte의 범위 밖 !
		// short(X) int(O)
		// Type mismatch: cannot convert from int to byte
		// 묵시적으로 정수 기본값의 자료형은 int(4byte 정수형) ! 
		// num1 = (byte)128; // int => byte : 128
		// num1 = (byte)130; // -127
		// num1 = (byte)-129; // 12

		num1 = (byte) -130; // 126

		long num2 = 1;
		int num3 = (int) num2;

		// 형변환 불가 1L, 1l -> long 데이터값 (접미사)
		// int num4 = 1L;
		// int num4 = 1l;
		int num4 = (int) 1L;

		int num5 = 'A'; // 65
		num5 = '가'; // 10진수: 44032, 16진수: '\uAC00'

		// System.out.println("num1 : " + num1);
		// System.out.println("num2 : " + num2);
		// System.out.println("num3 : " + num3);
		// System.out.println("num4 : " + num4);
		// System.out.println("num5 : " + num5);

		// int의 자료형의 최댓값(최솟값)
		// int -> Integer(참조형 자료)
		// : int(기본 정수 자료형)의 랩퍼(wrapper) 클래스
		System.out.println("int의 최댓값 : " + Integer.MAX_VALUE);
		System.out.println("int의 최솟값 : " + Integer.MIN_VALUE);

		int num = (int) 1E3; // 10의 3승
		System.out.println("num : " + num);
	}

}
