package Opps_Program;


class CarClass{
	String carName;
	int CarId;
	//Parameterized constructor
	CarClass(String name, int id){
		this.carName=name;
		this.CarId=id;
	}
}
class Driver extends CarClass{
	String driverName;
	 public Driver(String name, String cname, int cid){
		super(cname,cid);
		this.driverName=name;
	}
}
public class Associations_Imfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver object=new Driver("Sachin", "Ford EcoSport", 9988);
		System.out.println(object.driverName + "Is a driver of :" + object.carName + "And CarId is: "+object.CarId );	

	}

}
