package ch17.sec04.exam03;

import java.util.stream.*;

public class StreamExample {
	private static int sum;

	public static void main(String[] args) {
//		int sum = 0;
		
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("총합:" + sum);
	}
}




