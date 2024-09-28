package javaprograms;

class class1 {
	
	static void add() {
		 int c= 100+100;
		 System.out.println("Addition of Numbers:"+c);
	}
	
}

class class2 extends class1{
	static void sub() {
		 int c= 110-100;
		 System.out.println("Subraction of Numbers:"+c);
	}
	
}

class class3 extends class2{
	void multiply() {
		 int c= 10*10;
		 System.out.println("Multiple two number:"+c);
	}
	
}

class class4 extends class3{
	void division() {
		 int c= 10/10;
		 System.out.println("Division of two Number:"+c);
	}
	
}

public class MultiLevel_Inheritance extends class4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class3 c3= new class3();
		class4 c4= new class4();
			add();
			sub();
			c3.multiply();
			c4.division();
			
	}

}
