package javaprograms;

import java.util.Scanner;

public class Switch_Java {
	
	public static void main(String[] args) {
		
		Scanner S1= new Scanner(System.in);
		System.out.println("Enter 1 for Chrome");
		System.out.println("Enter 2 for Firefox");
		System.out.println("Enter 3 for Safari");
		System.out.println("Enter 4 for Edge");
		switch (S1.nextInt()) {
		
		case 1: System.out.println("Launching Chrome Browser");
		break;
		
		case 2: System.out.println("Launching Firefox Browser");
		break;
		
		case 3: System.out.println("Launching safari Browser");
		break;
		
		case 4: System.out.println("Launching edge Browser");
		break;
		
		default:
			System.out.println("Your Selection is wrong");
			
		S1.close();
		
		}
		
	}

}
