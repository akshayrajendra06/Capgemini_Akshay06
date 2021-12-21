package Opps_Program;

public class Polymorphism_Method_Overloading {
	
	public static void test_1( int a) {
		System.out.println("Test_1   int value a : "+a);
	}
	
	public static void test_1( double a) {
		System.out.println("Test_1  double value a : "+a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test_1('a');
		test_1(55.60);
		
	}

}
