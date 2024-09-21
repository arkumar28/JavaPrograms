package basicsprograms;

public class NonStaticMethod {

	public void addition() {
	System.out.println("Addtion of 2 Number");
	}
	
	public static void addition1() {
		System.out.println("Addtion of 3 Number");
		}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		NonStaticMethod n1 = new NonStaticMethod();
		n1.addition();
		addition1();
	}
	
}
