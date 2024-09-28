package javaprograms;

import java.util.Scanner;

public class ArthemeticUsingGlobalVariable {

	int a, b, c;
	
	void add() {
		System.out.println("Addition of Two Number: "+a+b);
	}
	
	void sub() {
		System.out.println("Subraction of Two Number: "+ (a-b));
	}
	void mul() {
		System.out.println("Multiplication of Two Number: "+ (a*b));
	}
	void mod() {
		System.out.println("Modulus of Two Number: "+ (a%b));
	}
	void div() {
		System.out.println("division of Two Number: "+ (a/b));
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArthemeticUsingGlobalVariable ag = new ArthemeticUsingGlobalVariable();
		Scanner si = new Scanner(System.in);		
		System.out.println("Enter Value of a: ");
		ag.a=si.nextInt();
		System.out.println("Enter Value of b: ");
		ag.b=si.nextInt();
		ag.add();
		ag.sub();
		ag.mul();
		ag.mod();
		ag.div();
		si.close();

	}

}
