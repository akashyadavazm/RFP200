package Day2Problems.ProgramWithForLoop;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 231, reverse = 0;
		for (; num != 0; num = num / 10) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
		}
		System.out.println("Reversed Digit is : " + reverse);

	}

}
