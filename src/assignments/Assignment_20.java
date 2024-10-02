package assignments;

class classA1{
	
	public void addition() {
		System.out.println("Result of Two Number Addition:"+(1+2));
	}
}

class classA2 extends classA1{
	
	public void addition() {
		System.out.println("Addition of Two Number:"+(1+2));
	}
}


public class Assignment_20 extends classA2{
	
	public static void main(String[] args) {
	
		classA2 a2 = new classA2();
		classA1 a1 = new classA1();
		a2.addition();
		a1.addition();
		
	
	}
}
