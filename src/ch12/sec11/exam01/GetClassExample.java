package ch12.sec11.exam01;

public class GetClassExample {
	public static void main(String[] args) throws Exception {
		Class clazz1 = Car.class;
		
		Class clazz2 = Class.forName("ch12.sec11.exam01.Car");
		
		Car car = new Car();
		Class clazz3 = car.getClass();
		
		System.out.println(clazz1.getPackage().getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getName());
	}
}
