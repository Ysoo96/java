package home;

// 접근 제한자(access modifier)
public class Child { // public : 가장 개방적
// protected class Child { // protected X
// default class Child { // X -> 무표기(default) 
// class Child { // O -> 무표기(default) : 같은 패키지에서만 접근 가능
// private class Child { // X

	// 멤버 필드(변수)
	// public String spec; // has-A (소속/집합)
	// protected String spec; // 같은 패키지 접근 가능
	String spec; // 같은 패키지 접근 가능
	// private String spec; // 같은 클래스에서"만" 접근 허용

	// 생성자
	public Child() {
		System.out.println("생성자");
	}

	// 인스턴스 멤버 메소드
	void print() {
		System.out.println("print");
	}

	public static void main(String[] args) {

	}

}
