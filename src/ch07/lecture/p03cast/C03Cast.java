package ch07.lecture.p03cast;

public class C03Cast {
	public static void main(String[] args) {
		method1(new Animal());
		method1(new Horse());
		method1(new Fish());
		
		System.out.println("실행 흐름 이어감...");
	}
	
	public static void method1(Animal a) {
		a.breath();
		
		Horse h = (Horse) a;
		h.run();
	}
}








