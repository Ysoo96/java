package work;

// 인터페이스
// 상위 계층
// 대외적/대내적 : 개방적 관계 / 지시와 명령 -> public
public interface DemoInterface {
// abstract public interface DemoInterface {

	// 멤버필드 = 정적 상수만 가능 -> 생략 표기 가능
	// String spec; // X
	String spec = "CEO";
	// final String spec = "CEO";
	// static final String spec = "CEO";
	// public static final String spec = "CEO";
	// protected static final String spec = "CEO"; // X
	// private static final String spec = "CEO"; // X

	// 생성자 X : 인터페이스 수행(구현)의 의무 X
	// DemoInterface() {}

	// 인스턴스 메소드 사용 불가
	// void doIt() {}

	// 추상 메소드 : 지시
	// abstract void order();
	void order();
	// public void order();
	// private void order(); // X
	// protected void order(); // X

	// void order2(); // O

	// 정적 메소드
	static void staticMethod() {
	}

	public static void main(String[] args) {
		System.out.println("인터페이스의 메인 메소드");

		DemoInterface job = new Clerk2();
		job.order();
	}

}
