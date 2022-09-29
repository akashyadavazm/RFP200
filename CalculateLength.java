package Day3.linecomparisonproblem;

public class CalculateLength {
	int x1; int y1;
	int x2; int y2;
	public void calculate(int x1, int y1, int x2, int y2) {
		int length;
		length = (int) Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		System.out.println("Length : " +length);

	}
public static void main(String[] args) {
	CalculateLength cal = new CalculateLength();
	cal.calculate(10, 14, 20, 19);
}
}
