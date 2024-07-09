package com.javateam.jse;

public class OuterClass {
	// 인스턴스 멤버 클래스 : has-A
	protected class InnerClass {
		String str;

		InnerClass() {

		}

		void method() {

		}
	}

	// 정적 멤버 클래스
	public static class StaticClass {
		String str;

		StaticClass() {

		}

		void method() {

		}
	}

	public OuterClass() {
		// 로컬(지역) 클래스
		class LocalClass1 {
			String str;

			LocalClass1() {

			}

			void method() {

			}
		}
		// 지역 클래스의 인스턴스
		LocalClass1 local1 = new LocalClass1();
		local1.method();
	}

	void method() {
		// 로컬(지역) 클래스
		class LocalClass1 {
			String str;

			LocalClass1() {

			}

			void method() {

			}
		}
		// 지역 클래스의 인스턴스
		LocalClass1 local1 = new LocalClass1();
		local1.method();
	}

	public static void main(String[] args) {
		// InnerClass inner = new InnerClass(); // X
		// InnerClass inner = new OuterClass().new InnerClass(); // O
		// OuterClass outer = new OuterClass();
		// InnerClass inner = outer.new InnerClass(); // O
		// OuterClass.InnerClass inner2 = outer.new InnerClass(); // O
		// inner2.method();

		// StaticClass stClass = new StaticClass(); // O
		// StaticClass stClass = new OuterClass().new StaticClass(); // X
		// StaticClass stClass = outer.new StaticClass(); // X
		// OuterClass.StaticClass stClass = new StaticClass(); // O
		// OuterClass.StaticClass stClass = OuterClass.new StaticClass(); // X
		// stClass.method();
	}

}
