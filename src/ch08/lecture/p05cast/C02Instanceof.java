package ch08.lecture.p05cast;

public class C02Instanceof {
	public static void main(String[] args) {
		MyInterface02 o1 = new MyClass021();
		MyInterface02 o2 = new MyClass022();
		
		MyClass021 o3 = (MyClass021) o1; // ok
		MyClass022 o4 = (MyClass022) o2; // ok
		
		MyClass022 o5 = (MyClass022) o1; // x
		
		System.out.println("실행 흐름 이어감");
		
	}
}





