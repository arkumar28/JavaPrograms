package javaprograms;

import java.util.Scanner;

public class AreaofCircle_Math {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		for (int i=1;i<=2;i++) {
			System.out.println("Enter R value");
			double r = Sc.nextDouble();
			double areaofcricle = Math.PI*r*r;
			System.out.println("Area of Circle:"+areaofcricle);
			Thread.sleep(2000);
		}
		
		Sc.close();
	}
	

} 
