package day2WhileLoop;

public class SumOfNaturalNumber {

	public static void main(String[] args) {

		int num = 50;
		int i = 1;
		int sum = 0;
		while (i <= num) {
			sum = sum + i;
			i++;
//			System.out.println(sum);

		}
		System.out.println("Sum Of Natural Number is : " +sum);

	}

}
