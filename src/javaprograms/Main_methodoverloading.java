package javaprograms;

public class Main_methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main_methodoverloading mo = new Main_methodoverloading();
		System.out.println("Main Method");
		main("Arun");
		mo.main();

	}
	
	 static void main(String Name){
		
		System.out.println(Name);
		
	}
	void main(){
		System.out.println("Main Method with No Argument");
	}

}
