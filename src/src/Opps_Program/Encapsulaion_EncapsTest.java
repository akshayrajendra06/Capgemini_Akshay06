package Opps_Program;


//Creating another class with some of variables;
//Employee information

class Empl_oyee{
	private String empname="SACHIN A";
	private int empId=101;
	//<==== Oh!!... Now I got you encapsulation, but tell me how can I access you?
	//Encapsulation : Okay, My dear user! Nothing to worry.. 
	// In order to access me you got to go under two methods specifically, get another set.
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	//Getter and setter methods
	// We need to create methods to access the variables... VVVVImpo: methods should be public.
}

public class Encapsulaion_EncapsTest {

	String name ="Sachin";
	public static void main(String[] args) {
		Empl_oyee obj = new Empl_oyee();
		obj.setEmpId(101);
		obj.setEmpname("Sachin A");
		System.out.println(obj.getEmpId());
		System.out.println(obj.getEmpname());
	}
}