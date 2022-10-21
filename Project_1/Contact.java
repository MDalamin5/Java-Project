package Project_1;

public class Contact {
	
	private String name;
	private String email;
	private String phoneNo;
	
	
	public Contact(String name, String phoneNo)
	{
		this.name=name;
		this.phoneNo= phoneNo;
	}
	
	public Contact(String name, String email, String phoneNo)
	{
		this.name= name;
		this.email= email;
		this.phoneNo= phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Phone Number: "+phoneNo);
		System.out.println();
	}
	
	
	
	 
}
