package ch17.exercise.exam06;

import java.util.*;
import java.util.stream.*;

public class Example1 {
	public static void main(String[] args) {
		List<Member> list = List.of(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26));
		
		System.out.println("for 사용 ####");
		double sum = 0;
		for (Member member : list) {
			sum += member.getAge();
		}
		
		double avg = sum / list.size();
		
		System.out.println(avg);
		
		Double avg2 = list.stream()
			.collect(Collectors.averagingDouble(Member::getAge));
		System.out.println(avg2);
			
		double avg3 = list.stream()
			.mapToInt(Member::getAge)
			.average()
			.getAsDouble();
		System.out.println(avg3);
	}
}






