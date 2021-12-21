package Opps_Program;

class person{
	
	String pname = "Akshay";
	public void show1() {
		System.out.println(" Stutdent Proparties ");
	}
	
}
public class Single_Inheritance extends person {
	
	String cou = "Java_Program";
	public void show() {
		System.out.println("I am student who to class :");
	}
	public static void main(String[] args) {
		
		
		Single_Inheritance obj = new Single_Inheritance();
		
		obj.show1();
		obj.show();
		System.out.println(" "+obj.pname);
		System.out.println(" "+obj.cou);
		
	}

}
