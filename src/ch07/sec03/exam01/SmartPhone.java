package ch07.sec03.exam01;

public class SmartPhone extends Phone {
	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone(String, String) 생성자 실행됨");
	}
}
