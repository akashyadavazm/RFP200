package day2OperatorProgram;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// month
		System.out.println("Enter the month");
		int m = sc.nextInt();

		// day
		System.out.println("Enter the day");
		int d = sc.nextInt();

		boolean result;

		for (m = 3; m < 7; m++) {
			for (d = 1; d <= 31; d++) {
				if (m == 3) {
					if (d <= 31) {
						result = true;
						System.out.println(result);
						break;
					}
				} else {
					if (m < 6) {
						if (d < 31) {
							result = true;
							System.out.println(result);
							break;
						}
					} else {
						if (m == 6) {
							if (d <= 20) {
								result = true;
								System.out.println(result);
								break;
							}
						} else {
							result = false;
							System.out.println(result);
							break;
						}
					}
				}

			}

		}
	}

}
