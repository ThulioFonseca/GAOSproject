package aplication;

public class Client {
	
	String name;
	long phone;
	String email;
	
	
	public Client(String name, long phone, String email) {
		
		this.name = name;
		this.phone = phone;
		this.email = email;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}
