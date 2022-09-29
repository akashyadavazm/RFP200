package Day3Problem;

public class SecondLargestArray {
	public static int SecondLargest(int A[], int Bound) {
		int temp = 0;
		for (int i=0;i<Bound;i++)
		{
			for(int j=i+1;j<Bound;j++)
			{
				if (A[j]<A[i])
				{
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		return A[Bound - 2];
	}
public static void main(String[] args) {
	int A[] = {32,22,11,14,55};
	System.out.println("Second largest number is : "+SecondLargest(A, 5));
}
}
