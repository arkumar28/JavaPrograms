package javaprograms;

import java.util.Scanner;

public class Assignment_2 {

	//Assignment 9	Find Area of Rectangle using Scanner class
	
	public static void areaofrectangle()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of l:");
		double l = s1.nextDouble();
		System.out.println("Enter the value of b:");
		double b = s1.nextDouble();
		double area_of_rectangle = l*b;
		System.out.println("Area of Rectangle= "+area_of_rectangle);
		s1.close();
	}
	
	public static void main(String[] args) {
		areaofrectangle();
	}
	
}
