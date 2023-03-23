package ch18.exercise.exam07;

import java.io.*;

public class Example {
	public static void main(String[] args) {
		// 확인문제 7
		// filePath 값
		String filePath = "src/ch18/exercise/exam07/Example.java";

		try (
				FileReader fr = new FileReader(filePath);
				BufferedReader br = new BufferedReader(fr);) {

			String line = null;
			
			int lineNumber = 1;
			while ((line = br.readLine()) != null) {
//				System.out.println(lineNumber + ":" + line);
				System.out.printf("%3s:%s%n", lineNumber, line);
				lineNumber++;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
