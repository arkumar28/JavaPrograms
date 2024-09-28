package assignments;

class Class1{
	// Assignment 14: Single level inheritance by using Static methods
	static void add() {
		int a = 10+11;
		System.out.println("Addition of Number:"+a);
	}
	// Assignment 15 Single level inheritance by using Non Static methods
	void sub(){
		int a = 100-11;
		System.out.println("Subtraction of Number:"+a);
	}
}

public class Assignment_14_15 extends Class1 {

	public static void main(String[] args) {
		add();
		Class1 c1 = new Class1();
		c1.sub();
	}

	

}
