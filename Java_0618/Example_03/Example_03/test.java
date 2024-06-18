package Example_03;

public class test {

	public static void main(String[] args) {
		// 확인문제 1
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z); // 31

		System.out.println("------------------------");

		// 확인문제 2
		int score = 85;
		String result = (!(score > 90) ? "가" : "나");
		System.out.println(result); // 가

		System.out.println("------------------------");

		// 확인문제 3
		// 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 인당 몇 개를 가질 수 있고, 몇 개가 남는지
		int pencils = 534;
		int students = 30;

		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);

		// 남은 연일 수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);

		System.out.println("------------------------");

		// 확인문제 4
		// 변수 value의 값이 356이라면 300이 나올 수 있도록 코드를 작성 | 산술 연산자만 사용
		int value = 365;
		System.out.println(value / 100 * 100);

		System.out.println("------------------------");

		// 확인문제 5
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double) (lengthTop + lengthBottom) * height / 2;
		System.out.println(area);

		System.out.println("------------------------");

		// 확인문제 6
		int x1 = 10;
		int y1 = 5;

		System.out.println((x1 > 7) && (y1 <= 5)); // true
		System.out.println((x1 % 3 == 2) || (y % 2 != 1)); // false

		System.out.println("------------------------");

		// 확인문제 7
		double x2 = 5.0;
		double y2 = 0.0;
		double z2 = 5 % y;
		if (Double.isNaN(z2)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result2 = z2 + 10;
			System.out.println("결과 : " + result2);
		}
	}

}
