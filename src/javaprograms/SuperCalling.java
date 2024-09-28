package javaprograms;


class Reporting {
	
	Reporting (String a){
		System.out.println("Reporting");
	}
	
}

class Screenshot extends Reporting{
	
	Screenshot (){
		super("Arun");
		System.out.println("Screenshot");
	}
	
}

public class SuperCalling extends Screenshot {

	SuperCalling(){
//		super(10,20);
		System.out.println("Testcase Super Calling");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SuperCalling();
		
	}

}
