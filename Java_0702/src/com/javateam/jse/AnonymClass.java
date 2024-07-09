package com.javateam.jse;

public class AnonymClass {
	void method(Other other) {
		other.otherMethod();
	}

	public static void main(String[] args) {
		Other other = new Other();

//		AnonymClass anonym = new AnonymClass();
//		anonym.method(other);

		// 익명 인스턴스 -> 일회성
		// new AnonymClass().method(other);

		// 익명 인스턴스 -> 인자
		// new AnonymClass().method(new Other()); // O

		// 익명 클래스
		// new (형식적)생성자 { 구문 }
		// 생성자의 형태를 취하고 있지만. 생성자 X -> 익명 클래스

		// 오버라이팅 -> is-A 관계(상속, 구현)
		// new Other() 이하의 구문 -> Other 부모 클래스에서 상속하는 익명 클래스 -> 일회성
		// 1), 2) 동일하게 자녀 클래스 활용 -> SubOther, 익명 클래스
		// 2) 일회성 (즉성 작성 -> 호출) -> 성능(속도) 향상
		// 속도 향상을 요하는 UI 프로그램(안드로인드 API 등)
		SubOther sub = new SubOther();
		new AnonymClass().method(sub); // 1)

		new AnonymClass().method(new Other() { // 2)
			@Override
			void otherMethod() {
				super.otherMethod();
			}
		});
	}

}

class SubOther extends Other {
	@Override
	void otherMethod() {
		super.otherMethod();
	}
}

// 외부 클래스
class Other {
	// 생성자
	Other() {
		// 생성자 내부에서 직접적인 오버라이딩 X
//		@Override
//		void otherMethod() {
//			
//		}
	}

	void otherMethod() {
		System.out.println("otherMethod");
	}
}
