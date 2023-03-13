package ch09.sec04.exam01;

public class A {
	public void method1(int arg) {
		int var = 1;
		
		class B {
			void method2() {
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);
//				var = 1;
			}
		}
		
//		var = 2;
		
		B b = new B();
		b.method2();
	}
}
