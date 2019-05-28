package aplication;

public class Device {
	
	String trouble;
	String manufacture;
	String model;
	
	
	public Device(String trouble, String manufacture, String model) {
		
		this.trouble = trouble;
		this.manufacture = manufacture;
		this.model = model;
	}


	public String getTrouble() {
		return trouble;
	}


	public void setTrouble(String trouble) {
		this.trouble = trouble;
	}


	public String getManufacture() {
		return manufacture;
	}


	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	

}
