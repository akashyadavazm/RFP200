package day2OperatorProgram;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		double a = sc.nextDouble();
		System.out.println("Enter the value of b : ");
		double b = sc.nextDouble();
		System.out.println("Enter the value of c : ");
		double c = sc.nextDouble();

		System.out.println("Quadratic equation = " + a + "x*x + " + b + "x + " + c);

		double delta = b * b - 4 * a * c;
		System.out.println("value pf delta : " + delta);

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.println("First root of Quadratic Equation is " + x1);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("Second root of Quadratic Equation is " + x2);
	}

}