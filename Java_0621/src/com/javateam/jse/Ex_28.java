package com.javateam.jse;

public class Ex_28 {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;

		// for (; i <= 10;) {
		while (i <= 10) {
			// System.out.print(i + " ");
			sum += i;
			// sum += i++;
			System.out.printf("1 ~ %d까지의 합계 = %d%n", i, sum);
			i++;
		}
	}

}
