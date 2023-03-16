package ch15.exercise.exam10;

import java.util.*;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>();

		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));
		
//		System.out.println(treeSet);
		System.out.println(treeSet.last().id + ":" + treeSet.last().score);
	}
}
