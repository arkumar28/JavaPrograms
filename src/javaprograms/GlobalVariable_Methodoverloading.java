package javaprograms;

public class GlobalVariable_Methodoverloading {

	 int a,b,c;
	
	
	
	static void addition(int a, int b) {
		int d = a+b;
		System.out.println("Addition of two Number "+d);
	}
	
	static void addition(int a, int b, int c) {
		int d = a+b;
		System.out.println("Addition of two Number "+d);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addition(10,20);
	}

}
