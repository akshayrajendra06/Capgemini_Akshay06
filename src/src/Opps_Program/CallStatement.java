package Opps_Program;

public class CallStatement {
	
	CallStatement(){
		this(5);
		
		System.out.println("D() ");
	}
	
	{
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	}
	  CallStatement(  int b){
		  System.out.println(b);
		System.out.println("D(int)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallStatement obj = new CallStatement();
		
	}

}
