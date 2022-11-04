package day15problems;

import java.util.HashMap;

public class Newhassh {
	public static void main(String[] args) {
	
	HashMap<String ,Integer> h = new HashMap<>();
	h.put("Akash", 1);
	h.put("Sujit", 2);
	h.put("ajeet", 2);
	h.put("Adityaa", 2);
	h.put("Abhimanyu", 3);
	System.out.println(h);
	h.remove("Adityaa");
	System.out.println(h);

}

}