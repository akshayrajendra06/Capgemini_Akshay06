package Opps_Program;

class Dwe{
	
public void show(){
	System.out.println("I am d");
	}  
} 
  
class Jac extends Dwe{
void show1(){
		System.out.println("Hii I am Akshay From Absract class :");
	}
}

class Si extends Jac{
	void show2() {
		System.out.println("New_one Class Will Call Akshay :");
	}
}


public class Down_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dwe i =  new Si();// Down_ Casting 
		Jac obj = (Jac) i ;// Down Casting
		obj.show();
		obj.show1();
		
		Si obj2 = (Si) i;
		obj2.show2();
		
		// obj.show2();// CTE
		//Si obj1 = (Si) i; //obj1.show(); // CTE
		
 
		 		
		

	}

}
