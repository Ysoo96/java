package com.javateam.jse;

public class Ex_36 {

	// 정적 상수
	public static final int MONDAY = 0;
	public static final int TUESDAY = 1;

	public static void main(String[] args) {
		
		// System.out.println(Week.MONDAY);
		System.out.println(Week.MONDAY.name());
		System.out.println(Week.MONDAY.ordinal());
		System.out.println(Week.MONDAY.getVal());

	}
}