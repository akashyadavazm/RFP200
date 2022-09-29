package day2OperatorProgram;

import java.util.Scanner;

public class ArithmaticOperation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a");
		int a = sc.nextInt();

		System.out.println("Enter the value of b");
		int b = sc.nextInt();

		System.out.println("Enter the value of c");
		int c = sc.nextInt();

		int abc1 = a + b * c;
		int abc2 = c + a / b;
		int abc3 = a % b + c;
		int abc4 = a * b + c;

		System.out.println(abc1 + " " + abc2 + " " + abc3 + " " + abc4);
//		for maximum
		if (abc1 > abc2) {
			System.out.println("abc1 is maximum");
		} else {
			if (abc2 > abc3) {
				System.out.println("abc2 is maximum");
			} else {
				if (abc3 > abc4) {
					System.out.println("abc3 is maximum");
				} else {
					System.out.println("abc4 is maximum");
				}
			}
		}
//		for minimum
		if (abc1 < abc2) {
			System.out.println("abc1 is minimum");
		} else {
			if (abc2 < abc3) {
				System.out.println("abc2 is minimum");
			} else {
				if (abc3 < abc4) {
					System.out.println("abc3 is minimum");
				} else {
					System.out.println("abc4 is mainimum");
				}
			}

		}
	}
}