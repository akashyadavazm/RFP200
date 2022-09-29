package Day3Problem;

public class LargestElementsInAnArray {
	public static void main(String[] args) {
		int Array[] = {70, 30, 20, 90, 10, 50, 80, 60, 40};
		int max = Array[0];  // By Default
		
		for(int i=0;i<Array.length;i++)
		{
			if(Array[i]>max)
			{
				max = Array[i];
				
			}
			
		}
		System.out.println("Largest element present in an Array is " +max);
	}

}
