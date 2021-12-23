package Encapsulation_Learn;


class Employee_55{
	
	private int Id;
	private long phone_no;
	private String User_name,Email_Id, Possition;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		this.User_name = user_name;
	}
	public String getEmail_Id() {
		return Email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.Email_Id = email_Id;
	}
	public String getPossition() {
		return Possition;
	}
	public void setPossition(String possition) {
		this.Possition = possition;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	
}

public class Encapsulation_Priavet_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Employee_55 obj = new Employee_55();
		
		obj.setId(5555);
		obj.setUser_name("Akshyay");
		obj.setEmail_Id("akshay@ggg.com");
		obj.setPhone_no(4568586);
		obj.setPossition("CE");
		
		
		System.out.println(obj.getUser_name());
		System.out.println(obj.getEmail_Id());
		System.out.println(obj.getId());
		System.out.println(obj.getPhone_no());
		System.out.println(obj.getPossition());
		
		

	}

}
