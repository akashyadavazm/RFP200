package day2WhileLoop;

public class ReverseInteger {

	public static void main(String[] args) {

		int num = 246276276, reverse = 0;

		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reverse digit is : " + reverse);

	}

}
