package Opps_Program;



class A_kshay{
	void bhu() {
		System.out.println("Hii Monu Where are you now bro");
	}
}

class M_onu extends A_kshay{
	void shi_On() {
		System.out.println("Here bro I am Fine ");
	}
}
class Employee{
	float sa=4000;
}

class Mahi{
	void mai() {
		System.out.println("I am in Dhule ");
	}
}

class Swet extends Mahi{
	void swe() {
		System.out.println("I am in Avarangabad");
	}
}


class Sachin extends M_onu{
	
	void shi_On() {
		System.out.println("I am in Jalgon :");
	}
}

//public is Optional 
  class Inheritance_Java  extends Employee{// Inheritance_Java 
	int bo=5000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M_onu M = new M_onu();
		Inheritance_Java p =new Inheritance_Java();
		System.out.println("Emplyee Class Extends \\ float sa=4000  :"+p.sa);
		System.out.println("Inheritance_Java  extends Employee \\int bo=5000  :"+p.bo);
		
		M.shi_On();
		M.bhu();
		Sachin  S = new Sachin();
		S.shi_On();
		
		Swet P = new Swet();
		P.swe() ;
		P.mai();
		
		
		
	}

}

