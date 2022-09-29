package Day1Problems;

public class LeapYear {
	public static void main(String[] args) {
		int Year = 2000;
		Boolean leap = false;
		
		if (Year % 4 == 0) {
			if (Year % 100 == 0) {
				if (Year % 400 == 0)
					leap = true;
					else
					leap = false;
				}
			else
				leap = false;
		}
		if(leap)
			System.out.println(Year+ " is a leap year");
		else
			System.out.println(Year+ " is not a leap year");

	}

}
