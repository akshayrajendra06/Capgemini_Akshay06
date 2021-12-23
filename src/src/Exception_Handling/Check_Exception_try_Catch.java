package Exception_Handling;
import java.lang.ArithmeticException;
public class Check_Exception_try_Catch {

	public static void main(String[] args) {
	
		System.out.println(45);
		
		System.out.println(0);
		int a=45,b=0;
		try {
			int d = a/b;
			System.out.println("Div "+d);
		}
//		catch(Exception e){
//			System.out.println(e);	
//		}
		catch(ArithmeticException c) {
			System.out.println(c);// Same output
			System.out.println(c);
			System.out.println(c.toString());
		
			
			c.printStackTrace();
			
		}
		finally {
			System.out.println(" OOOOOOOOOOOOOOOOOO");
		}
		System.out.println(" This also print ???");
		

	}

}
