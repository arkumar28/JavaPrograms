package javaprograms;

public class Global_Variable {

	static int a = 100; // Global variable
	int b=10; 			// Non Static Global Variable
	static int pi ; 	// Global variable
	String name;
	
	 public static void main(String[] args) {
		 
		int c=10;  //Local Variable
		
		System.out.println(a+c);
		System.out.println(pi);
		
		// non Static Global Variable
		Global_Variable gb =new Global_Variable();
		System.out.println(gb.b);
		System.out.println(gb.name);
	
	 }
	
}
