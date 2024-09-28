package assignments;

class animals {
	
	animals(){
		
		System.out.println("Animals: Lion, Tiger");
	}
}

class sports extends animals {
	
	sports(){
		
		System.out.println("Sports: Cricket,Football");
	}
}

class sportspersons extends sports {
	
	sportspersons(){
		super();
		System.out.println("Sports Persons: Sachin, Ronaldo");
	}
}



public class Assignment_17 extends sportspersons {

	Assignment_17(){
		System.out.println("Assignment 17 Done");
	}
	public static void main(String[] args) {
		new Assignment_17();
	}
	
}
