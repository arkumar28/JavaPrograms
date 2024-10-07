package javaprograms;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter Age of Person: ");
		int age = S1.nextInt();
		System.out.println("Gender of person: ");
		String gender = S1.next();

		if((age>18) && (gender.equals("Female"))){

		System.out.println("Person can able to vote");

		}
		else {
			System.out.println("Person cannot vote");
		}

	}

}
