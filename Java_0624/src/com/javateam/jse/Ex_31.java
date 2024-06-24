package com.javateam.jse;

public class Ex_31 {
	public static void main(String[] args) {

		// 배열 변수의 선언
		// int []arr;
		// int arr[];

		// arr = new int[3]; // 메모리 공간 할당
		// 배열 변수는 지역 변수일지라도 메모리 할당 시 초기값 자동 할당
		// int -> 0, String -> null

		// int[] arr = new int[3];
		int arr[] = { 1, 2, 3 };

		System.out.println(arr[0]);
		// 배열의 인덱스가 범위를 벗어났을 경우 -> 예외처리
		// System.out.println(arr[3]);

		System.out.println("배열의 길이 : " + arr.length);
	}
}
