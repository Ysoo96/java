package com.javateam.Library;

public class Ex_02 {

	public static void main(String[] args) {
		// 연산 (operation, calculation)
		char ch1 = 'A' + 1; // 65 + 1 -> 66 -> 'B'
		// 문자 : '', 문자열 : ""
		// 자바 -> 문자/문자열 구분
		// 파이썬, Javascript -> 문자/문자열 구분 안함
		// ch1 = "A"; 문자열이 아니라 불가능

		// 문자열 -> 문자 : 변환(conversion, casting)
		// "A" 문자열에서 0번째 문자(char)를 추출 : 메소드(charAt)
		ch1 = "A".charAt(0);

		// ch1 = -1; 0 ~ 65535 범위 밖
		// ( ) 형변환(캐스팅) 연산자(operator)
		// ch1 = (char) -1; 변환만 됨, null 문자로 치환
		// \u0000 (null 문자)
		// ch1=''; 커파일 에러 -> 문법적 에러(invalid)

		System.out.println("ch1 = " + ch1);

		var ch2 = 14;
		// 지역 변수
		// Javascript의 변수 선언법
		// 자료형을 따로 언급하지 않고 입력되는 값을 통해서 자료형 결정
		// 타입 추론(값으로 자료형 결정)
	}

}
