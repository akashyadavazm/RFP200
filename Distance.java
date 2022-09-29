package day2OperatorProgram;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of abscissa : ");
		double x = sc.nextDouble();

		System.out.println("Enter the value of ordinate : ");
		double y = sc.nextDouble();

		double distance = Math.sqrt(x * x + y * y);
		System.out.println("Distance of Co-ordinate from the origin is : " + distance);
	}

}
