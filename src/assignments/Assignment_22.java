package assignments;

//abstract class is present along with concrete class

abstract class Tom{
	abstract void addition();
	
}

class Dog extends Tom{

	void addition() {
		System.out.println("Adddition of Two Numbers:"+(2+3));
	}
	
}

public class Assignment_22 {
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.addition();
		
	}

}
