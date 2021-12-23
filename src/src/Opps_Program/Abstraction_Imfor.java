package Opps_Program;


interface A{  
void a();  
void b();  
void c();  
void d();  
}  
  
abstract class B implements A{  
public void c(){
	System.out.println("I am c");
	}  
}  
  
class M extends B{  
public void a(){
	System.out.println("I am a");
	}  
public void b(){
	System.out.println("I am b");
	}  
public void d(){
	System.out.println("I am d");
	}  
} 

//abstract methods  
abstract class Aks_hay{
	abstract void akshay();
	
}
//Creating a Child class which inherits Abstract class  
class New extends Aks_hay{
void akshay(){
		System.out.println("Hii I am Akshay From Absract class :");
	}
}

class New_one extends Aks_hay{
	void akshay() {
		System.out.println("New_one Class Will Call Akshay :");
	}
}

abstract class Bank{    
abstract int getRateOfInterest();    
}    
class SBI extends Bank{    
int getRateOfInterest(){
	return 7;
	}    
}    
class PNB extends Bank{    
int getRateOfInterest(){
	return 8;
	}    
}
public class Abstraction_Imfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a Test class which calls abstract and non-abstract methods  
		Aks_hay A = new New();
		Aks_hay B = new New_one();
		A.akshay();
		B.akshay();
		
		Bank Ba ;
		
		Ba = new SBI();
	int k = 	Ba.getRateOfInterest();
		Ba = new PNB();
	int j = Ba.getRateOfInterest();	
	
	A a=new M();  
	a.a();  
	a.b();  
	a.c();  
	a.d();
	
		System.out.println("Rate of Interest is: "+k+" %"); 
	
		System.out.println("Rate of Interest is: "+j+" %");  
	}

}
