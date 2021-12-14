package Opps_Program;

abstract class Alein{
	//Abstract method (does not have body)
	public abstract void animalSound();
	//Regular method
	public void sleep() {
		System.out.println("Zzbfadgagafagfzz");
	} //trying to know the sound of an animal while sleeping
		//do we know which animal is that? ------> Sleeping<=== Animal
}
//Hide mechanism should be done in creating abstract subclass.......
class Man extends Alein{
	//Complete information will lay here
	//and this complete the hide mechanism
	public void animalSound() {
		System.out.println("A man says : Drurrr Durrrrrr");
	}
}

public class Abstraction_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Man object=new Man();
		object.animalSound();
		object.sleep();
	}

}
