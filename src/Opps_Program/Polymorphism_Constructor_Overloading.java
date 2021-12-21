package Opps_Program;

public class Polymorphism_Constructor_Overloading {

	 Polymorphism_Constructor_Overloading(int a){
			System.out.println("Polymorphism_Constructor_Overloading  int value :"+a);
	}
	
	 Polymorphism_Constructor_Overloading(double a){
		System.out.println("Polymorphism_Constructor_Overloading Double Value :"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_Constructor_Overloading a = new Polymorphism_Constructor_Overloading('a');
		Polymorphism_Constructor_Overloading b = new Polymorphism_Constructor_Overloading(50.666);
	//	Polymorphism_Constructor_Overloading('k');// CTE becouse We can not be use public static void 
		
	}

}
