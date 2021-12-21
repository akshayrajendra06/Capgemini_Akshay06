package Opps_Program;

class Spider3{
	
	public static void show() {// We cannot Achieve Method Overriding with the help of static methods 
		
		System.out.println(" Spider  Show() :");
	}
}
class Man_5 extends Spider3{
	public  static void show() {
		System.out.println(" Spider Extends to Man ==> Spider Man : show()");
	}
	
}
class No_Way_Home extends Spider3{
	public static  void show() {
		System.out.println(" No Way Home extends In Spider2 ==> No way Home Spider:  show()");
	}
}

public class Polymorphism_Method_Shodowing_OR_Hidenibg {// Method Widening 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man_5 obj = new Man_5();
		obj.show();
		
		Spider3 S = obj;
		S.show();
		
		Spider3 obj2 = new No_Way_Home();
		obj2.show();
		
		No_Way_Home OJ = new No_Way_Home();
		OJ.show();
	
		
	}

}
