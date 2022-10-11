package Day13Problems;

public class MaximumFloat {

	public static <F extends Comparable<F>> F maximum(F g, F h, F i) {

		F max = g;
		if (h.compareTo(max) > 0) {
			max = h;
			if (i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;

	}
	public static void main(String[] args) {
		System.out.println("Maximum String is  " + maximum(56.765, 34.657, 67.45));

	}
}
