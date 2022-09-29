package Day3Problem;

public class ElementsOnOddposition {
	public static void main(String[] args) {
		
		int Array[] = {70, 30, 20, 90, 10, 50, 80, 60, 40};
		
		System.out.println("Odd elements of an Array is ");
		for(int i=0;i<Array.length;i++)
		{
			if (i%2==1)
			{
				System.out.print(Array[i] + " ");
			}
		}
	}

}
