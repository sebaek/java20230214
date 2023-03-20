package ch17.exercise.exam05;

import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions");

		list.stream()
				.filter(Example2::havingJava)
				.forEach(System.out::println);
	}

	private static boolean havingJava(String s) {
		return s.toLowerCase().contains("java");
	}
}
