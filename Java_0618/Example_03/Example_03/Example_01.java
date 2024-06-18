package Example_03;

public class Example_01 {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int x1, y1, x2, y2;
		System.out.println("x = " + x); // 1
		System.out.println("y = " + y); // 1

		System.out.println("----------------------");
		x1 = ++x; // 2
		System.out.println("x1 = " + x1);

		System.out.println("----------------------");
		x2 = x++; // 2
		System.out.println("x2 = " + x2);

		System.out.println("----------------------");
		y1 = --y; // 0
		System.out.println("y1 = " + y1);

		System.out.println("----------------------");
		y2 = y--; // 0 실행 후에는 y2 = -1
		System.out.println("y2 = " + y2);
	}

}
