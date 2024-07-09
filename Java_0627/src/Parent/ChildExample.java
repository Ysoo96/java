package Parent;

public class ChildExample {

	public static void main(String[] args) {

		Child child = new Child();

		Parent parent = child;

		parent.method1();
		parent.method2();
		// parent.method3(); // 부모 클래스에 method3() 메소드가 선언 되어 있지 않아 불가

	}

}
