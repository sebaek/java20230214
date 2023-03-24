package ch15.sec04.exam02;

import java.util.*;

public class SynchronizedMapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

		Thread threadA = new Thread() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					map.put(i, "내용" + i);
				}
			};
		};
		Thread threadB = new Thread() {
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					map.put(i, "내용" + i);
				}
			};
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("총 객체 수 : " + map.size());
	}
}
