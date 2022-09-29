package Day3Problem;

public class SmallestElementInAnArray {
	public static void main(String[] args) {
		int Array[] = {70, 30, 20, 90, 10, 50, 80, 60, 40};
		int min = Array[0];  // By Default
		
		for(int i=0;i<Array.length;i++)
		{
			if(Array[i]<min)
			{
				min = Array[i];
				
			}
			
		}
		System.out.println("Smallest element present in an Array is " +min);
	}

}
