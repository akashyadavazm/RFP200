package Day3Problem;

public class ReverseArray {
	public static void main(String[] args) {
		
		int Array[] = {70, 30, 20, 90, 10, 50};
		int RevArray[]= new int [Array.length];
		
		System.out.println("Elements of an Array are ");
		
		for(int i=0;i<Array.length;i++) 
		{
			System.out.print(Array[i]+", ");
		}

			System.out.println();
		
		// For reverse Array
		System.out.println("Reverse Array elements are ");
		for(int i=0;i<Array.length;i++)
		{
			RevArray[i]=Array[(Array.length-1)-i];
			System.out.print(RevArray[i] +", ");
			
		}
		
	}

}
