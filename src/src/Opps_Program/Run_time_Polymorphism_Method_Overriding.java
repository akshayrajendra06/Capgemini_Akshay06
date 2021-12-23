package Opps_Program;

class Spider{
	
	public void show() {// We cannot Achieve Method Overriding with the help of static methods 
		
		System.out.println(" Spider  Show() :");
	}
}
class Man_3 extends Spider{
	public void show() {
		System.out.println(" Spider Extends to Man ==> Spider Man : show()");
	}
	
}

public class Run_time_Polymorphism_Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Man_3 M= new Man_3();
		M.show();
		
		
		Spider S = M;
		S.show();
	}

}
