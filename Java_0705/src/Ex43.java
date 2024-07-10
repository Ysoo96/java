
public class Ex43 {
	public static void main(String[] args) {
		int num1 = 1;
		Integer intObj = num1; // 오토 박싱(auto-boxing)
		// 자동 형변환(기본형 -> 참조형(포장 wrapper 클래스)

		// java.lang.NumberFormatException : 내용이 정수가 아닌 문자열 변환했을 때
		// int num2 = intObj.parseInt("abcd");
		// int num2 = num1 + intObj.parseInt("2"); // int + int
		// 1 + "2" -> 1 + 2 -> 3

		// int num2 = num1 + intObj.parseUnsignedInt("-2"); // X
		// int num2 = num1 + intObj.parseUnsignedInt("2");

		int num2 = num1 + intObj.valueOf("2");
		// int + Integer -> int + int
		// : Integer -> int (오토 언박싱 : auto-unboxing)
		// 참조형(포장 wrapper 클래스) -> 기본형
		System.out.println("num2 : " + num2);
	}
}
