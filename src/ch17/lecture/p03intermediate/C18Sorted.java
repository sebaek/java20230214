package ch17.lecture.p03intermediate;

public class C18Sorted {
	public static void main(String[] args) {
		
	}
}
// getter, 생성자, toString
class Car {
	private String name;
	private int price;
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
}
