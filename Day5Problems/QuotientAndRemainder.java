package Day5Problems;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {

		int Divident, Divisor;

		Scanner sc = new Scanner(System.in);

		Divident = sc.nextInt();
		Divisor = sc.nextInt();

		System.out.println("Divident and Divisors are: " + Divident + "" + Divisor);

		int Quotient = Divident / Divisor;
		int Remainder = Divident % Divisor;

		System.out.println("Quotient is: " + Quotient);

		System.out.println("Remainder is: " + Remainder);

	}

}
