package javaprograms;

// Operators using Operators(+,-,*,/,%) using static and non_static method

public class Operators {
	
	static void addition() {	
		
		//a variable and 10 will be literals
		int a=10,b=10,c;
		c=a+b;
		System.out.println("Addition of two Number is "+c);
	}

	static void subraction() {
		int a=100,b=10,c;
		c=a-b;
		System.out.println("Subraction of two Number is "+c);
		
	}
	
	static void multiplication(int a, int b) {
		int c= a*b;
		System.out.println("Multiplication of two Number is "+c);
	}
	
	void division(int a, int b) {
		
		int c = a/b;
		System.out.println("Division of two Number is "+c);
	}
	
	void modulus(int a, int b) {
		
		int c = a%b;
		System.out.println("Modulus of two Number is "+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operators op = new Operators();
		
		addition();
		subraction();
		multiplication(10, 20);
		op.division(12, 5);
		op.modulus(102, 10);
	}

}
