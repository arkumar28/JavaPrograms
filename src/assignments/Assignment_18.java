package assignments;

class MD {
	
	MD (String a){
		System.out.println(a+" Managing");
	}
	
}

class Add extends MD{
	
	Add (int a, int b){
		super("Arun");
		System.out.println("Adding a and b: "+(a+b));
	}
	
}

public class Assignment_18 extends Add {
	
	Assignment_18(String a){
			super(10,20);
			System.out.println(a);
	}
	
	public static void main(String[] args) {
		 new Assignment_18("Assignment 18 Done");
	}

}
