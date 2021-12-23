package Opps_Program;

public class Static_New {
	static {
		System.out.println("static block of parent class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticChildClass obj = new StaticChildClass();
		obj.display();

	}

}

class StaticChildClass extends Static_New{
	static {
		System.out.println("static block of child class");
	}
	public void display() {
		System.out.println("Method from child class");
	}	
}
