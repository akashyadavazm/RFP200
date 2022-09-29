package Day1Problems;

public class Demonstrate {
	
	static int a = 5;
	static int b;
	
	static void fnct(int c){
		
		System.out.println("value of a : " +a);
		System.out.println("value of b : " +b);
		System.out.println("value of b : " +c);
		
	}
	static {
		b = a + 8;
	}
	public static void main(String[] args) {
		fnct(18);
	}
}
