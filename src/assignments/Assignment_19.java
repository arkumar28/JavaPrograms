package assignments;


// Assignment 19 parameterized and non-parameterized this calling statement in java

public class Assignment_19 {
	
	Assignment_19(int a, int b){
		System.out.println("Addition of a and b "+ (a+b));
	}
	
	Assignment_19(String a){
		this();
		System.out.println(a);
	}
	
	Assignment_19(){
		this(10,11);
		System.out.println("This Calling Statement");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Assignment_19();
	}

}
