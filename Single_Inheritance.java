package basicsprograms;

// Assignment 14: Single level inheritance by using Static methods
// Assignment 15: Single level inheritance by using Non Static methods

class ClassA{
	
	static void add() {
		int a = 10+11;
		System.out.println("Addition of Number:"+a);
	}
	
	void sub() {
		int a = 100-11;
		System.out.println("Subratcion of Number"+a);
		
	}
	
	
}

public class Single_Inheritance extends ClassA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA ca = new ClassA();
		add();
		ca.sub();
		

	}

}
