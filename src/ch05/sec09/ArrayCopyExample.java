package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] old = {"java", "array", "copy"};
		
		String[] newArr = Arrays.copyOf(old, 5);
		
		System.out.println(Arrays.toString(newArr));
	}
}
