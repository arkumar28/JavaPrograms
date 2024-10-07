package assignments;

//super most class having 2CM, abstract class having 2AM & 02CM, subclass having 2CM

class Animals1 {
	
	void dog() {
		System.out.println("Dog is an Animal");
	}
	void wolf() {
		System.out.println("Wolf is an Animal");
	}
	
}

abstract class Birds extends Animals1{
	
	abstract void peacock();
	abstract void pigeon();
	void hawk() {
		System.out.println("Hawk is Bird");
	}
    void goose() {
    	System.out.println("Goose is Bird");
	}
	
}

public class Assignment_23 extends Birds {

	void peacock() {
		System.out.println("Peacock is Bird");
	}
	
	void pigeon() {
		System.out.println("Pigeon is Bird");
	}
	
	public static void main(String[] args) {
		Assignment_23 a23 = new Assignment_23();
		a23.peacock();
		a23.pigeon();
		a23.hawk();
		a23.goose();
		a23.dog();
		a23.wolf();
		
		
	}
}
