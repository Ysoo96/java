package Example_03;

public class BitLogic {

	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25)); // 9
		System.out.println("45 | 25 = " + (45 | 25)); // 61
		System.out.println("45 ^ 25 = " + (45 ^ 25)); // 52
		System.out.println("~45 = " + (~45)); // -46
		System.out.println("------------------------------------");

		byte receiveData = -120;

		// 방법1: 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1); // 136

		// 방법2: 자바 API를 이용해서 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2); // 136

		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest); // -120
	}

}
