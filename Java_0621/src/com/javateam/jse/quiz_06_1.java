package com.javateam.jse;

public class quiz_06_1 {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if (i == j)
					System.out.println();
			}
		}
	}

}
