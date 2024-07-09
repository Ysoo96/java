package work;

// 상속 -> 계약
// Clerk(하급자) -> AbstractClass(상급자)
public class Clerk extends AbstractClass {

	Clerk() {
		// super(): // 추상 클래스의 기본 생성자
		System.out.println("구현 클래스의 생성자");
	}

	// 강제성 X
//	@Override
//	void work() {
//		super.work();
//	}

	// 추상(지시)을 구현하다.
	@Override
	void order() {
		// super.order(); // 추상 메소드 자체 호출 X
		System.out.println("지시대로 수행하다.");
	}

}
