package com.javateam.jse;

public class Ex_32 {
	public static void main(String[] args) {

		int arr[];
		// arr = new int[]; // X
		// arr = {1, 2, 3}; // X
		// arr = new int[3]; // O
		arr = new int[] { 1, 2, 3 }; // O
		// arr = new int[3] { 1, 2, 3 }; // X

		// System.out.println(arr[0]);

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		// foreach loop : index 검색 X
		// 다음 요소(next elemnet) 검색
		// Iterator(반복자) 패턴 방식
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}
}
