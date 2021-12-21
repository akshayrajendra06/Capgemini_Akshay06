package Opps_Program;

// Concrete Method is Classified into two Type 
//1) Static Concrete Method
//2) Non-Static Concrete Method 

// We can Declare both Abstract Method and Concrete Method inside the Abstract Class 

abstract class Ku{
	abstract public void show();//  Abstract Method
	abstract public void show2();
	
	public  void demo() {
		System.out.println(" Demo() ++++++++++++");// Concrete Method
	}
}
abstract class Pan extends Ku{
	public void show() {
		System.out.println(" Abstarct Method show() ");
	}
}


class Poo extends Pan{
	
	public void show2() {//  Concrete Method
		System.out.println(" Poo  Is Not Abstarct class ");
	}
}
public class Abstraction_Concreat_Method {

	public static void main(String[] args) {
		
		/* Note:: We cannot create object for Abstract Class 
		 * but we can Create Object reference Variable for abstract class  
		 */
		
		Ku obj;// reference Variable for abstract class Ku
		
		// Ku obj1 = new Ku(); //  We cannot create object for Abstract Class
		// obj.show(); CTE
		Poo obj2 = new Poo();
		obj2.show();
		obj2.show2();
		obj2.demo();// You Run Successful
	//	Ku obj 
		obj = obj2;
		obj.demo();

	}

}
