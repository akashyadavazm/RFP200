package Day13Problems;

public class MaximumInteger {

	public static <E extends Comparable<E>> E maximum(E a, E b, E c) {

		E max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}

		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;

	}

	public static void main(String[] args) {
		System.out.println("Maximum number is " + maximum(100, 265, 363));
	}

}
