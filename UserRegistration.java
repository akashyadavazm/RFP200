package day19Problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	private static void firstName() {
		Scanner sc = new Scanner(System.in);
		String patternF = "[[A-Z]{1}+[a-z]{2,}]";
		System.out.println("Enter the First Name for Validation!");
		String fName = sc.next();

		Pattern pF = Pattern.compile(patternF);
		Matcher mf = pF.matcher(fName);
		if (mf.find()) {
			System.out.println("Valid First Name");
		} else
			System.out.println("Invalid First Name!");

	}

	private static void lastName() {
		Scanner sc = new Scanner(System.in);
		String patternL = "[[A-Z]{1}+[a-z]{2,}]";
		System.out.println("Enter the Last Name for Validation!");
		String lName = sc.next();

		Pattern pL = Pattern.compile(patternL);
		Matcher mL = pL.matcher(lName);
		if (mL.find()) {
			System.out.println("Valid Last Name");
		} else
			System.out.println("Invalid Last Name!");

	}

	private static void eMail() {
		Scanner sc = new Scanner(System.in);
		String patternE = "[a-z.a-z]+@[a-z.a-z.a-z]";
		System.out.println("Enter the Email for Validation!");
		String eMail = sc.next();

		Pattern pE = Pattern.compile(patternE);
		Matcher mE = pE.matcher(eMail);
		if (mE.find()) {
			System.out.println("Email is valid");
		} else
			System.out.println("Invalid Email!");
	}

	private static void mobileNo() {
		Scanner sc = new Scanner(System.in);
		String patternM = "[[91]{1}+ [0-9]{1}[0-9]{9}]";
		System.out.println("Enter the MoblieNo for Validation!");
		String mobileNo = sc.next();

		Pattern pM = Pattern.compile(patternM);
		Matcher mM = pM.matcher(mobileNo);
		if (mM.find()) {
			System.out.println("MobileNo is valid");
		} else
			System.out.println("Invalid MobileNo!");

	}

	private static void password() {
		Scanner sc = new Scanner(System.in);
		String patternP = "[[A-Z] [0-1] @]";
		System.out.println("Enter the Password for Validation!");
		String password = sc.next();

		Pattern pP = Pattern.compile(patternP);
		Matcher mP = pP.matcher(password);
		if (mP.find()) {
			System.out.println("Valid Password");
		} else
			System.out.println("Invalid Last Name!");
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println(
					"Enter your choice :\n1 -> First Name\n2 -> Last Name\n3 -> Email\n4 -> Mobile no.\n5 -> Password  ");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				firstName();
				break;
			case 2:
				lastName();
				break;
			case 3:
				eMail();
				break;
			case 4:
				mobileNo();
				break;
			case 5:
				password();
				break;

			}
		} while (choice != 0);

	}

}
