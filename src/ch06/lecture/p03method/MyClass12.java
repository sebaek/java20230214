package ch06.lecture.p03method;

public class MyClass12 {
	
	int method1() {
		
		// 1. 메소드 종료, 
		// 2. 오른쪽 값을 호출한 곳으로 return(반환)
		// 오른쪽 값은 메소드 리턴타입과 일치해야함
		return 3; 
	}
	
	int method2() {
		// 메소드에 리턴타입을 명시하면
		// 해당타입의 값을 꼭 리턴해야함
		if (true) {
			return 3;
		}
		
		return 5;
	}
}







