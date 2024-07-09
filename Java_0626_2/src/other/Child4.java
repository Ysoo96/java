package other;

import home.Parent;

// 상속 관계 : is-A 관계
// A Child is a Parent.
// protected : 보호된(보호받는) -> 보호자(부모 관계) -> 상속 관계

public class Child4 extends Parent {

	// 멤버 필드 부모 클래스의 멤버 필드 접근(사용)
	// String spec2 = spec; // 부모의 protected 멤버에 접근(사용) O
	// String spec2 = super.spec; // 부모 클래스의 인스턴스 키워드(super)
	String spec2 = this.spec; // this(자기 자신의 클래스 인스턴스)

	Child4() {
		// super(); // 묵시적으로 부모 클래스의 기본 생서자 호출
		System.out.println("자녀 클래스의 생성자");
	}

	void print() {
		spec2 = super.spec;
	}

	// 자신의 멤버임에도 불구하고 접근 제한
	static void staticMethod() {
		// spec2 = super.spec; // X
		Child4 child4 = new Child4();
		System.out.println(child4.spec);
	}

	public static void main(String[] args) {

		staticMethod();

		// Parent parent = new Parent();
		// System.out.println(parent.spec); // X

	}

}
