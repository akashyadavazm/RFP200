package Day13Problems;

public class RefractAll<T extends Comparable<T>> {

	T x, y, z;

	public RefractAll(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T maximum() {
		return RefractAll.maximum(x, y, z);
	}

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {

		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
			if (z.compareTo(max) > 0) {
				max = z;
			}
		}
		printmax(x, y, z, max);
		return max;

	}

	private static <T> void printmax(T x, T y, T z, T max) {
		System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);

	}

	public static String testMaximum(String x, String y, String z) {
		
		String max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
			if (z.compareTo(max) > 0) {
				max = z;
			}
		
			printmax(x, y, z, max);
		return max;
		
	}

	private static void printmax(String x2, String y2, String z2, String max) {
		System.out.println();

	}

	public static void main(String[] args) {
		Integer xInt = 3, yInt = 4, zInt = 5;
		Float xFl = 3.4f, yFl = 3.5f, zFl = 4.8f;
		String xStr = "Apple", yStr = "Peach", zStr = "Banana";
		
		RefractAll.testMaximum(xStr, yStr, zStr);
		new RefractAll(xInt, yInt, zInt).maximum();
		new RefractAll(xFl, yFl, zFl).maximum();
		new RefractAll(xStr, yStr, zStr).maximum();
	}

}
