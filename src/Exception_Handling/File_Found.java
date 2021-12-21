package Exception_Handling;
import java.io.FileInputStream;

public class File_Found {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream obj = new FileInputStream("G:/Akshay");
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

}
