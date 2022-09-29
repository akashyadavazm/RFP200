package Day3.linecomparisonproblem;

public class LineComparison {
	public void comparison() {
		int x1 =10,y1=14;
		int x2=20,y2=19;
		int x3 =12,y3=11;
		int x4=20,y4=17;
		int length1,length2;
		{
		length1=(int)Math.sqrt( (x2-x1)*(x2-x1) +(y2-y1)*(y2-y1) );
		System.out.println(length1);
		length2=(int)Math.sqrt( (x4-x3)*(x4-x3) +(y4-y3)*(y4-y3) );
		System.out.println(length2);
		}
		if(length1<length2)
			System.out.println("length2 is greater than length 1");
		else if (length1 > length2)
			System.out.println("length1 is greater than length 2");
		else
			System.out.println("length1 is equal to length 2");
	}
public static void main(String[] args) {
	LineComparison line = new LineComparison();
	line.comparison();
	}
	
}

