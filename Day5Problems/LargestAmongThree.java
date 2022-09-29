package Day5Problems;

public class LargestAmongThree {
	public static void main(String[] args) {

		int a = 1000, b = 200, c = 500;

		if (a > b) {
			if (c > a)

				System.out.println("Greatest no. is " + c);

			else

				System.out.println("Greatest no. is " + a);

		} else if (b > c) {

			if (a > b)

				System.out.println("Greatest no. is " + a);

			else

				System.out.println("Greatest no. is " + b);

		} else {

			System.out.println("Greatest no. is " + c);

		}
	}
}
