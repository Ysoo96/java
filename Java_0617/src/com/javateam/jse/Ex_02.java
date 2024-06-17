package com.javateam.jse;

public class Ex_02 {

	public static void main(String[] args) {
		// boolean b = false;
		// boolean b = true;
		// boolean b = True; // (X) 파이썬 True/False
		// boolean b = 1; // (X) C++에선는 1 -> true, 0 -> false
		// boolean b = 'false';
		// boolean b = "false";

		// 형변화(casting) 메소드
		// boolean b = Boolean.parseBoolean("false");
		int num = 1;
		boolean b = num == 1 ? true : false;

		System.out.println("b : " + b);
	}

}
