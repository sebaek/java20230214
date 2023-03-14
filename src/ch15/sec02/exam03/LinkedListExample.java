package ch15.sec02.exam03;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		var list1 = new ArrayList<String>();
		var list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list1.add(0, String.valueOf(i));
//			list1.add(String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list2.add(0, String.valueOf(i));
//			list2.add(String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);
	}
}
