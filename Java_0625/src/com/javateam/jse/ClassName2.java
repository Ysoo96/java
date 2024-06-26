package com.javateam.jse;

public class ClassName2 {
// public static class ClassName2 {

	// static : 메모리 주소가 프로그램 종료시까지 (고)정적(그대로 지속)
	static int num; // 정적 필드
	
	static void staticMethod() {
		
	}

	public static void main(String[] args) {
		
		// System.out.println(num);
		System.out.println(ClassName2.num);
		// staticMethod();
		ClassName2.staticMethod();
	}

}
