package com.javateam.jse;

public class Ex_33 {
	public static void main(String[] args) {

		// 다차원 배열(2차원 배열 이상) 션언
		// int arr2[][];
		// int [][]arr2;
		// int []arr2[];

		// arr2 = new int[][]; X
		// arr2 = new int[3][2];

		// 행렬(matrix)
//		arr2 = new int[][] { { 1, 2 },
//							 { 3, 4 },
//							 { 5, 6 } };

		// arr2 = new int[3][2] { { 1, 2 }, { 3, 4 }, { 5, 6 } }; X
		// arr2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; X

//		int arr2[][] = new int[][] { { 1, 2 },
//									 { 3, 4 },
//								   	 { 5, 6 } };

		int arr2[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		// 낱개 조회
		// System.out.println(arr2[2][1]);

		// 배열의 길이
		System.out.println(arr2.length); // 3 (행의 갯수)

		// 전체 요소의 길이(갯수)
		// 행 요소의 갯수 * 열 요소의 갯수
		System.out.println(arr2.length * arr2[0].length); // 6

		// 전체 조회
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2[i].length; j++) {
//				System.out.print(arr2[i][j] + " ");
//			}
//			System.out.println();
//		}

		// foreach (enhanced(향상된) for) loop
		for (int[] arr1 : arr2) {
			for (int n : arr1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}
}
