package Opps_Program;

class A_A{
	static  int a=20;
	public static void test() {
		System.out.println(" From class A-test() +++++++++++++++");
	}
	
	static {
		System.out.println(" From  Class A-SIB*****************");
	}
}


public class Inheritance3 extends A_A{

	static int b=20;
	
	public static void demo() {
	
		System.out.println(" From class B Demo()  +++++++++++++++++++");
	}	
		static {
			System.out.println(" From class B- SIB *****************");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" "+a);
		System.out.println(" "+b);
		
		test();
		demo();
		

	}

}
