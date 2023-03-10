package ch13.exercise.exam04;

public class Util {
	public static <P extends Pair<K, V>, K> V getValue(P pair, K key) {
		K k = pair.getKey();

		if (k.equals(key)) {
			return pair.getValue();
		}

		return null;
	}
}
