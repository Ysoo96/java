package com.javateam.jse;

public class Ex_02 {

	public static void main(String[] args) {
		int num1 = 3;
		String msg = "";

//		if (num1 > 0) {
//			msg = "양수";
//		} else {
//			msg = "음수";
//		}

		msg = num1 > 0 ? "양수" : "음수";

		System.out.println("msg : " + msg);
	}

}
