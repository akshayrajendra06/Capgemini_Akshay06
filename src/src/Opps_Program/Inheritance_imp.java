package Opps_Program;

class Animal{  
void eat(){
	System.out.println("eating...");
	}  
}  
class Dog extends Animal{  //Inheritance method
void bark(){
	System.out.println("barking...");
	}  
}
class Cat extends Animal{  
void meow(){
	System.out.println("meowing...");
	}  
}  

class E_mployee{  
	 float salary=40000;  
	}  

public class Inheritance_imp extends E_mployee {//Inheritance method

	int bonus=10000;  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance_imp p=new Inheritance_imp();  
		   System.out.println("Programmer salary is:"+p.salary);  
		   System.out.println("Bonus of Programmer is:"+p.bonus); 
		   
		   Dog d=new Dog();  
		   d.bark();  
		   d.eat();  
		   
		   Cat c=new Cat();  
		   c.meow();  
		   c.eat();  
		   //c.bark();//C.T.Error  
	}

}
