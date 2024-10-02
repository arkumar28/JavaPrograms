package assignments;

class classA11{
	
	void add() {
		System.out.println("Two Number Addition");
	}	
}

class classA12 extends classA11{
	
	void add() {
		System.out.println("Addition of Two Number");
		super.add();
	}
}

class classA13 extends classA12{
	
	void add() {
		System.out.println("Addition Operators");
		super.add();
	}
}


public class Assignment_21 {
	
	public static void main(String[] args) {
		
		classA13 a13 = new classA13();
		a13.add();
	}

}
