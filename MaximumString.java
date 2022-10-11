package Day13Problems;

public class MaximumString {

	public static <S extends Comparable<S>> S maximum(S d, S e, S f) {

		S max = d;
		if (e.compareTo(max) > 0) {
			max = e;
			if (f.compareTo(max) > 0)
				max = f;
		}
		return max;

	}

	public static void main(String[] args) {
		System.out.println("Maximum String is  " + maximum("Apple", "Peach", "Banana"));

	}

}
