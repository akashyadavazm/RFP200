package Day2Problems.ProgramWithForLoop;

public class Palindrome {
	public static void main(String[] args) {
		int num = 23132, reverse = 0;
		int temp = num;
		for (; num != 0; num = num / 10) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;

		}
		if (temp == reverse) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");

		}

	}
	
}
