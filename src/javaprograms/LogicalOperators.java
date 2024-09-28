package javaprograms;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		int b=20;
		
		
		if ((a==b)&& (a==10)) {
			System.out.println("1st If");
		}
		
		if ((a<b)&& (a==10)) {
			System.out.println("2nd If");
		}
		
		if ((a==b) || (a==10)) {
			System.out.println("3rd If");
		}
		
		if ((a<b) || (a==10)) {
			System.out.println("4th If");
		}
		
		if (!((a>b)&& (a==10))) {
			System.out.println("5th If");
		}
		
		if (!((a==b) || (a==10)) ){
			System.out.println("6th If");
		}

	}

}
	