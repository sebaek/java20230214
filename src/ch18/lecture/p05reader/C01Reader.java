package ch18.lecture.p05reader;

import java.io.*;

public class C01Reader {
	public static void main(String[] args) {
		// Reader : 문자단위 입력 스트림
		// 주요 메소드 : read
		
		String name = "output/writer2.txt";
		
		try (Reader rd = new FileReader(name)) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
