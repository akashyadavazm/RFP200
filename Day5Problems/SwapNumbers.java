package Day5Problems;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		int a, b, n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a and b");

		a = sc.nextInt();
		b = sc.nextInt();

		// Swap logic
		n = a;
		a = b;
		b = n;

		System.out.println("After swapping the numbers " + a + " " + b);
	}

}
