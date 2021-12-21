package Opps_Program;

class Spider2{
	
	public void show() {// We cannot Achieve Method Overriding with the help of static methods 
		
		System.out.println(" Spider  Show() :");
	}
}
class Man_4 extends Spider2{
	public void show() {
		System.out.println(" Spider Extends to Man ==> Spider Man : show()");
	}
	
}
class No_Way extends Spider2{
	public void show() {
		System.out.println(" No Way extends In Spider2 ==> No way Spider:  show()");
	}
}

public class Run_time_Polymorphism_Method_Overriding_for_Herarchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No_Way No1 = new No_Way();
		No1.show();

		Spider2 S = No1 ;
		S.show();
		// Man_4 M = S; //  CTEMan_4  Extends Not in No_way  
		
		Spider2 n = new Spider2();
		n.show();
		
		Spider2 Obj = new  Man_4();
		Obj.show();
		
		
		
		
		
	}

}
