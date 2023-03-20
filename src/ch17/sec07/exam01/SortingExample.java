package ch17.sec07.exam01;

import java.util.*;

public class SortingExample {
	public static void main(String[] args) {
		List<Student> list = List.of(
				new Student("홍길동", 30),
				new Student("신용권", 10),
				new Student("유미선", 20));

		list.stream()
				.sorted()
				.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();

		list.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));

	}
}
