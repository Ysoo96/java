import java.lang.reflect.Method;

public class Ex44 {

	public static void main(String[] args) {
		// Class clazz = String.class;
		// Class clazz = new String().getClass();

		Class clazz = null;

		try {
			clazz = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 없음");
			e.printStackTrace();
		}

		Method[] methods = clazz.getDeclaredMethods();

		for (Method m : methods) {
			System.out.println(m.getName()); // 멤버 메소드
		}
	}

}
