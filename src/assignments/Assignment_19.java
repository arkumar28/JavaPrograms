package assignments;


// Assignment 19 parameterized and non-parameterized this calling statement in java

class Managing {
	
	Managing (String a){
		System.out.println(a+" Managing");
	}
	
}

class Addition extends Managing{
	
	Addition (int a, int b){
		super("Arun");
		System.out.println("Adding a and b: "+(a+b));
	}
	
}

class Assigning extends Addition{
	
	Assigning (){
		super(10,11);
		System.out.println("Assigning Resource");
	}
	
}

class Computing extends Assigning{
	
	Computing (){
		System.out.println("Computing");
	}
	
}

public class Assignment_19 extends Computing {
	
	public Assignment_19() {
		System.out.println("Assignment done");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Assignment_19();
	}

}
