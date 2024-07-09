package com.javateam.jse;

import java.util.UUID;

public class Ex_41 {
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println("hashCode : " + obj.hashCode());
		System.out.println("UUID : " + UUID.randomUUID()); // 고유 코드
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		// java.lang.Object@35a50a4c : 객체(인스턴스) 고유값(클래스 명세 + 메모리 주소)
		System.out.println("toString : " + obj.toString());
		// 객체 -> 문자열 변환 ? -> 객체의 멤버 필드들의 내용 확인
		System.out.println("toString : " + obj);
		System.out.println("toHexString ; " + Integer.toHexString(900008524));

		Object obj2 = new Object();
		// 객체 고유값(주소)으로 비교
		// "같다" -> 특성(속성 -> 멤버 필드)들을 비교
		System.out.println("obj.equals(obj2) : " + obj.equals(obj2));
	}
}
