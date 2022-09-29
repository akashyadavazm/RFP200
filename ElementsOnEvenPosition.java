package Day3Problem;

public class ElementsOnEvenPosition {
	public static void main(String[] args) {
        int Array[] = {70, 30, 20, 90, 10, 50, 80, 60, 40};
	
		System.out.println("Even position elements of an Array are ");
		int len = Array.length;
		for(int i=0;i<len;i++) 
		{
			if(i%2==0)
			{
			System.out.print(Array[i] + " ");
			}
		}
	}

}
