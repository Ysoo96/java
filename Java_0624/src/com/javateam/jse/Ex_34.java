package com.javateam.jse;

public class Ex_34 {
	public static void main(String[] args) {

		// 가변 배열(행 고정, 열 가변 할당)
		int arr2[][] = new int[3][];

		// arr2[0] = new int[5];
		arr2[0] = new int[] { 1, 2, 3, 4, 5 };
		// arr2[1] = new int[4];
		arr2[1] = new int[] { 6, 7, 8, 9 };
		// arr2[2] = new int[3];
		arr2[2] = new int[] { 10, 11, 12 };

		// 낱개 개별 할당(대입)
		// arr2[0][0] = 1;

		// foreach (enhanced(향상된) for) loop
		for (int[] arr1 : arr2) {
			for (int n : arr1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
	}
}