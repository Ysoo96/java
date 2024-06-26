package com.javateam.jse;

public class ClassName {

	// 멤버(소속) 필드(속성, 변수)
	// 초기값을 대입하지 않을 경우 묵시적 기본값 대입
	int fieldName;

	// 생성자(구축자 : constructor)
	// 클래스와 동명, 리턴 자료형 무표기
	// 인자 없는 생성자 : 기본 생성자(default constructor)
	// 기본 생성자 외에 다른 생성자가 없다면
	// 기본 생성자는 묵시적 생성되어 사용 가능
	ClassName() { // 다른 생성자 존재시 명시적 정의

	}

	// 오버로딩(over-lod-ing) 생성자
	// ClassName(int num) {
	ClassName(int fieldName) {
		// this : 자기 자신의 인스턴스 객체
		this.fieldName = fieldName; // 멤버 필드 초기화
	}

	ClassName(int fieldName, int n) {
	}

	ClassName(String str) {
	}

	ClassName(String str, int n) {
		// this(str); // ClassName(String str) 호출
		// ClassName(str);
		// new ClassName(str); // new + 생성자 => 익면 인스턴스
	}

	// 인자명이 다른 경우 : 오버로딩 X
//	ClassName(int n2, String n2) {
//	}

	// ... 가변 인자 => 인자의 갯수 제한 없음
	// => 내부적으로 배열로 처리
	ClassName(int n, String... strings) {
		for (String s : strings) {
			System.out.print(s + " ");
		}
	}

	// 오버로딩 X : 가변 인자는 반드시 마지막 인자가 되어야 함
	// 가변 인자 뒤에 다른 인자가 올 수 없다
//	ClassName(int n, String... strings, int n) {
//	}

	// 생성자 X => 클래스와 이름이 같은 일반 메소드
	// 인스턴스 멤버 메소드 : static이 아닌 메소드
	// 비추천
	void ClassName() {
		System.out.println("메소드");
	}

	public int getNum(int num) {
		// return fieldName + num;
		return this.fieldName + num;
	}

	public void method(int num) {
		if (num < 0) {
			return; // 함수(메소드) 종료
		}
		System.out.println("num : " + num);
	}

	public static void main(String[] args) {

		// 인스턴스 생성
//		ClassName className = new ClassName();
//		className.fieldName = 3;
		ClassName className = new ClassName(3, "JAVA", "JSP");
//		ClassName className;
//		className = new ClassName();

		// 멤버 필드 접근(이용)
		// System.out.println(className.fieldName);

		// 멤버 메소드 호출(call)
		System.out.println(className.getNum(1)); // 4
		
		// className.method(1);
		className.method(-1);

	}

}
