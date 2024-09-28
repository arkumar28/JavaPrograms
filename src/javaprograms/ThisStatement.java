package javaprograms;

public class ThisStatement {

	ThisStatement(int a, int b){
		System.out.println("Addition of a and b "+ (a+b));
	}
	
	ThisStatement(String a){
		this();
		System.out.println(a);
	}	
	
	ThisStatement(){
		this(10,11);
		System.out.println("This Calling Statement");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThisStatement("Arun");
		
		
	}

}
