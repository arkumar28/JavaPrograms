package javaprograms;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = S1.nextInt();
		System.out.println("Age of person :"+age);
		
		S1.close();
		

	}

}
