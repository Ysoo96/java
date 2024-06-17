package com.javateam.jse;

public class Ex_03 {

	public static void main(String[] args) {
		// String str1 = "'강'";
		// String str1 = ""강""; // (X)
		// String str1 = "\"강\""; // (X)
		// String str1 = "자바\tjava"; // 탭(tab)
		// String str2 = "자바 java"; // 띄워쓰기
		// String str1 = "자바\njava"; // 줄바꿈

		// 텍스트 블럭 : since Java 13
		String str1 = """
				자바
				스프링
				파이썬
				""";

		System.out.println("str1 : " + str1);
		// System.out.println("str2 : " + str2);

		// String str3 = (String) (1 + 2 + 3 4 + 5); // (X)
		// String str3 = 1 + 2 + "3" + 4 + 5;
		// 3 + "3" + 4 + 5
		// "33" + 4 + 5
		// "334" + 5
		// "3345"
		
		// +1 : 부호 연산자
		// +1 + 2 : 사칙 연산자 -> 가산(덧셈) 연산자
		// 2 + "3" : (문자열) 연결 연산자
		String str3 = +1 + 2 + "3" + (4 + 5);
		// 3 + "3" + (4 + 5)
		// 3 + "3" + 9
		// "33" + 9
		// "339"
		
		// Object obj = "java";
		// String str3 = (String) obj;
		// 참조 자료형(클래스 등)의 경우는 상속/구현 광계가 있으면
		// ( ) (캐스팅 연산자)로 형변환이 가능
		System.out.println("str3 : " + str3);
	}

}
