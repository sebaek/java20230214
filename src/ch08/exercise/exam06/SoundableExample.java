package ch08.exercise.exam06;

public class SoundableExample {
	public static void main(String[] args) {
		printSound(new Dog());
		printSound(new Cat());
	}
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
}
