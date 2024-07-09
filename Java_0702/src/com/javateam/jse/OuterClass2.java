package com.javateam.jse;

public class OuterClass2 {
	// 내부 인터페이스
	interface InnerInterface {
		void abstMethod();
	}

	void method() {
		// 지역/익명 구현 클래스
		InnerInterface obj = new InnerInterface() {

			@Override
			public void abstMethod() {
				System.out.println("내부 인터페이스 구현");
			}
			
		};
		obj.abstMethod();
	}
	
	public static void main(String[] args) {
		OuterClass2 outer = new OuterClass2();
		outer.method();
	}

}
