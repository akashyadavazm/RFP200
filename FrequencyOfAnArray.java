package Day3Problem;

public class FrequencyOfAnArray {

	public static void main(String[] args) {
		int A[]= {2,3,2,5,2,3,4,6};
	
		for(int i=0;i<A.length;i++) {
			int count=0;
			for(int j =0;j<A.length;j++) {
				if(A[i]==A[j])
				count=count+1;
			}
			System.out.println("The Frequency of Element "+i +" is " +count );
		}
			
	}

}
