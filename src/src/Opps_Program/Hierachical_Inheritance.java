package Opps_Program;

class Junu {
	public void show() {
		System.out.println(" I am Akshay In Hierachical ");
	}
}
class Munu extends Junu{
	public void show1() {
		System.out.println(" Akshay Munu extens Junu :");
	}
}

class stud_ent extends Munu{
	public void show2() {
		System.out.println(" Student Extends Munu ::");
	}
}
class Doc extends Junu{
	public void show3() {
		System.out.println(" Doc extends Junu :");
	}
}

public class Hierachical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stud_ent obj = new stud_ent();
		Doc obj1 = new Doc();
		obj.show();
		obj.show1();
		obj.show2();
		//obj.show3();  CTE 
		obj1.show3();
		//  obj1.show();  Valid 
		

	}

}
