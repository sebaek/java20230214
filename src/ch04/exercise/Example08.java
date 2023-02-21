package ch04.exercise;

public class Example08 {
	public static void main(String[] args) {
		System.out.println("문제 1");
		/*
			0
			01
			012
			0123
			01234
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		System.out.println("문제 2");
		/*
		1
		12
		123
		1234
		12345
		*/
		
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= (i+1); j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("문제3");
		/*
		 	0
			10
			210
			3210
			43210 
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = i; j >= 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
















