package ch12.exercise.exam05;

import java.util.*;

public class StudentExample {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1")); // 들어가지 않도록
		hashSet.add(new Student("2"));
		
		System.out.println(hashSet.size()); // 2
	}
}
