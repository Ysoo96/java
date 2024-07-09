package com.javateam.jse;

public class AnonymClass2 {
	// 내부 인터페이스
	interface InnerInterface{
		void abstMethod();
	}
	
	void method(DemoInterface demoInterface) {
		demoInterface.order();
	}

	public static void main(String[] args) {
		
		// 익명 구현 객체(클래스)
		new AnonymClass2().method(new DemoInterface() {

			@Override
			public void order() {
				System.out.println("order");
			}
			
		});
		
		// 익명 클래스 -> 람다대수 프로그래밍 : 변환 가능
		new AnonymClass2().method(() -> System.out.println("order"));
	}

}

interface DemoInterface {
	void order();
}