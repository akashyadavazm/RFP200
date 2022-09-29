package day2IfElse;

import java.util.Scanner;

public class readNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a Number : ");
		int num = sc.nextInt();
		
		if (num == 1) {
			System.out.println("Unit");
		} else {
			if (num == 10) {
				System.out.println("Ten");
			} else {
				if (num == 100) {
					System.out.println("Hundred");
				} else if (num == 1000) {
					System.out.println("Thousand");
				} else {
					System.out.println("Please enter a valid number ");
				}
			}
		}
	}

}
