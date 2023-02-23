package ch05.exercise;

public class Exercise07 {
	public static void main(String[] args) {

		int answer = Integer.MIN_VALUE;
		
		int[] arr = { -1, -5, -3, -8, -2 };

		for (int i = 0; i < arr.length; i++) {

			if (answer < arr[i]) {
				// 내가 알고 있는 수보다 크면??
				answer = arr[i];
			}
			// 그렇지 않으면??
			
		}
		
		System.out.println(answer);
	}
}
