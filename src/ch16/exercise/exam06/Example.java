package ch16.exercise.exam06;

public class Example {
	public static void main(String[] args) {
		double result = calc((x, y) -> (x / y));
		System.out.println("result: " + result);
	}

	public static double calc(Function fun) {
		double x = 10;
		double y = 4;
		return fun.apply(x, y);
	}
}

@FunctionalInterface
interface Function {
	double apply(double x, double y);
}



