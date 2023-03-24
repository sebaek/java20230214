package ch14.sec05.exam02;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("1~100합: " + sumThread.getSum());
	}
}
