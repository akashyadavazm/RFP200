package Day3Problem;

public class duplicateArray {
	public static void main(String[] args) {
		int Array[] = {1,3,2,5,2,3,4,6};
		System.out.println("Duplicate element in given array : ");
		for(int i=0; i<Array.length;i++)
		{
			for(int j=i+1;j<Array.length;j++)
				if (Array[i]==Array[j])
			System.out.print(Array[j]+ " ");
		}

	}

}
