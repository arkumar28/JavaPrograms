package javaprograms;

public class Constrctor_Overloading {

	Constrctor_Overloading(int a, int b){
		
		System.out.println("Addition of a and b "+ (a+b));
		
	}
	Constrctor_Overloading(String a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		new Constrctor_Overloading(10,20);
		new Constrctor_Overloading("Arunkumar");
		
	}
}
