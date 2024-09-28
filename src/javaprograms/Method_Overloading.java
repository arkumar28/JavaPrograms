package javaprograms;

public class Method_Overloading {

	// Assignment 3 Operators with static method by using method overloading concepts
	// Assignment 4 Operators with Non Static  method by using method overloading concepts

	
	
	static void addition(int a, int b, int c) {
		 
		int d = a+b+c;
		System.out.println("Addition of three Number "+d);
	}
	
	void addition(int a, int b) {
		int c = a+b;
		System.out.println("Addition of two Number "+c);
	}
	
	void addition(int a, int b, int c, int d) {
		int e = a+b;
		System.out.println("Addition of Four Number "+e);
	}
	
	
	static void addition(int a, double b, int c) {
		 
		double d = a+b+c;
		System.out.println("Addition of three Number "+d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading mo = new Method_Overloading();
		addition(10,20,30);
		addition(10,30.56,30);
		mo.addition(10,20);
		mo.addition(10,20,30,40);
	}

}
