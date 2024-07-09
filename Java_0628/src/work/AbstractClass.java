package work;

// 추상 클래스 : 추상 (설계, 지시/명령) -> 구현(구체)
// 추상(지시) 가능한 : 중간 계층
// abstract public class AbstractClass {
public abstract class AbstractClass {
// public class AbstractClass {

	// abstract String job; // X
	String job;

	AbstractClass() {
		System.out.println("추상 클래스의 생성자");
	}

	// 추상 메소드
	abstract void order();

	static void stMethod() {

	}

	// abstract void work() {
	void work() {

	}

	public static void main(String[] args) {

		// 추상 클래스의 생성자만으로는 인스턴스 생성 불가
		// ex) 과장 지시 -> 과장 수행 : 기업의 업무 형태 X
		// AbstractClass aClass = new AbstractClass();
		AbstractClass aClass = new Clerk();
		aClass.order();

	}

}
