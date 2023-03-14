package ch16.exercise.exam07;

public class Example {
	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		
		for (int score : scores) {
			result = operator.apply(result, score);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// 스태틱 메소드 참조
		int max1 = maxOrMin((x, y) -> Math.max(x, y));
		System.out.println("최대값: " + max1);
		
		int max2 = maxOrMin((x, y) -> ((x > y) ? x : y));
		System.out.println("최대값: " + max2);
		
		int max3 = maxOrMin((x, y) -> {
			if (x > y) {
				return x;
			} else {
				return y;
			}
		});
		System.out.println("최대값: " + max3);
		
		// 스태틱 메소드 참조
		int min1 = maxOrMin((x, y) -> Math.min(x, y));
		System.out.println("최소값: " + min1);
		
		int min2 = maxOrMin((x, y) -> (x > y) ? y : x);
		System.out.println("최소값: " + min2);
		
		int min3 = maxOrMin((x, y) -> {
			if (x > y) {
				return y;
			} else {
				return x;
			}
		});
		System.out.println("최소값: " + min3);

	}
}





