package Opps_Program;


class Per{
	public void show() {
		System.out.println(" New Parsonal Imformation ");
	}
}
class Student_1 extends Per{
	public void show1() {
		System.out.println("I am akshay rajendra suryawanshi ");
	}
}

class Eng extends Student_1{
	public void show2() {
		System.out.println(" Engineering is Done Bro ");
	}
}
public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eng obj = new Eng();
		obj.show();
		obj.show1();
		obj.show2();
	}

}
