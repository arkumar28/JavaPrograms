package javaprograms;

abstract class authentication { // abstract class
	
	abstract void login();   // abstract method
	abstract void registration();  // abstract method
	
	//Abstract class can have concreate method
	void addition() {
		System.out.println("Addition of Numbers");
	}
}

abstract class Logout extends authentication{ // abstract class
	
	abstract void logout();   // abstract method
	abstract void signout();  // abstract method
	
	
}


public class AbstractClass extends authentication {

	void login() {
		System.out.println("Login to Application");
	}
	
	void registration() {
		System.out.println("Registration to Application");
	}
	void logout() {
		System.out.println("Logout from Application");
	}
	void signout() {
		System.out.println("Signout from Application");
	}
	public static void main(String[] args) {
		
		AbstractClass ac = new AbstractClass();
		ac.login();
		ac.registration();
		ac.logout();
		ac.signout();
		ac.addition();
		
	}
	
}
