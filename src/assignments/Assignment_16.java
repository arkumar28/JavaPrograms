package assignments;

// Assignment # 16 Multi level inheritance by using static and Non Static methods by using 4 classes


class Class1a{
	static int a=10, b=5, c;
	static void add() {
		
		c= a+b;
		System.out.println("Addition of two Numbers:"+c);
	}	
}

class Class2a extends Class1a{
	void sub() {
		c= a-b;
		System.out.println("Subraction of two Numbers:"+c);
	}
	
}

class Class3a extends Class2a{
	static void mul() {
		c= a*b;
		System.out.println("Multiplication of two Numbers:"+c);
	}
	
}

class Class4a extends Class3a{
	void div() {
		c= a/b;
		System.out.println("Division of two Numbers:"+c);
	}
}

public class Assignment_16 extends Class4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_16 as= new Assignment_16();
		as.sub();
		add();
		mul();
		as.div();
	}

}
