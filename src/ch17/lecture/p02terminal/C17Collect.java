package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class C17Collect {
	public static void main(String[] args) {
		List<Car> list = List.of(
				new Car("avante", "middle"),
				new Car("genesis", "heavy"),
				new Car("casper", "light"),
				new Car("morning", "light"),
				new Car("sonata", "heavy"),
				new Car("k5", "middle")
				);
		
		Map<String, List<Car>> r1 = list.stream()
				.collect(Collectors.groupingBy(Car::getType));
		
		for (var entry : r1.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
		
	}
}

// 생성자, toString, getter/setter
class Car {
	private String name;
	private String type;

	public Car(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", type=" + type + "]";
	}

}
