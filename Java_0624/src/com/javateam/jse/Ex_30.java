package com.javateam.jse;

public class Ex_30 {
	public static void main(String[] args) {

		String str1 = "홍길동"; // 1)
		String str2 = "홍길동"; // 2)
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");

		// == 참조하는(가르키는) 메모리 주소값으로 비교
		// 1), 2) 메모리 주소를 공유 p.156
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str3 == str4 : " + (str3 == str4));
	}
}
