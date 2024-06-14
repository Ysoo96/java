// 패키지(package) : 클래스, 인터페이스 등의 객체들의 모음
// 큰 단위 >> 작은(구체적인) 단위
// package : 패키지를 가리키는 키워드(keyword, 예약어)
// 지시어(identifier) : 키워드를 제외한 (사용자가) 작성한 말

package com.javateam.jse;

// 클래스명 = 클래스 파일명
// public : 접근 제한자(변경자/지시자/제어자)
// class : 클래스 지칭(가르키는) 키워드

public class Ex_01 {
	
//	static : 메모리에 정적인 주소 공간을 확보하여 사용
//			: 정적 키워드
//			void : 메소드(함수)의 결과값이 없는
//	main 메소드 이름 :  반드시 main
//	( - ) : 메소드의 인자부(매개변수)
//	String[] args : 메소드의 인자(매개변수, 형식인자, 가인자)
//	String : 문자열 자료형
//	[ - ] : 배열(array: 다수) 기호
//	args : 변수(인자) → arugments(인자들, 인수들)

	public static void main(String[] args) {
//		F2 >> javadoc 패널 : API 설명
//		java.base (module)
//		java.lang (package)
//		System (class)
//		out (field : 멤버 필드/변수)
//		println (method : 멤버 메소드)
		
		System.out.println("java");
	}

}
