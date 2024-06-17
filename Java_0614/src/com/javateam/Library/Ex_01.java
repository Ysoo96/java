package com.javateam.Library;

public class Ex_01 {

	public static void main(String[] args) {
		// “정수형”의 num 이름의 변수 작성 : 변수 선언(등록)
		int num;
		num = 1;		// 데이터 값 입력
		
		int num2 = 1;	// 변수 초기화
		// int num = 1; 동명의 변수 재선언X
		
		// char 문자형/정수형
		char ch1;
		ch1 = 'A';
		// 모든 코드 체계(encoding) 공통 분모(ASCII)
		// 'A' = 65 (10진수 : decimal)
		ch1 = 65;
		ch1 = 0101; 		// 8진수 (octal)
		ch1 = 0x41; 		// 16진수 (hexa-decimal) | 대문자 가능
		ch1 = 0b1000001; 	// 2진수 (binary) | 대문자 가능
		ch1 = '\u0041'; // unicode (UTF-8) | 대문자 불가능

		System.out.println("ch1 = " + ch1);
	}

}
