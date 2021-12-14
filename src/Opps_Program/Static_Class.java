package Opps_Program;

public class Static_Class {
	

		static int num;
		static String mystr;

		//first Static block
		static {
			System.out.println("Static block 1");
			num=68;
			mystr="JavaProgramming";		
		}
		//Second static block
		static {
			System.out.println("Static block 2");
			num=69;
			mystr="Second Static block";		
		}
		//Third static block
		static {
			System.out.println("Static block 3");
			num=70;
			mystr="Third Static Block";		
		}
		//fourth static block
		static {
			System.out.println("Static block 4");
			num=80;
			mystr="Fourth Static Block";		
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Multiple static block
				System.out.println("Value of num : " + num);
				System.out.println("Value of string : " + mystr);
	}

	}
