package Opps_Program;
class Ic{
	public void show() {
		System.out.println(" I am IC ");
	}
}
class Bc extends Ic{
	public void show1() {
		System.out.println(" I am Bc extend IC :");
	}
}

class Nc extends Bc{
	public void show2() {
		System.out.println(" I am NC extends Bc ::");
	}
}


public class Up_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nc obj = new Nc();
		obj.show2();
		
		
		Bc ob = obj;// Up_ Casting 
		ob.show1();
		
		Ic o = ob;
		o.show();// Up Casting 
		
	}

}
