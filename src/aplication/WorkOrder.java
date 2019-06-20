package aplication;



public class WorkOrder {
	private String status;
	private long number = 000;
	private String date;
	private double cost;
	private double price;
	private Device d;
	private Client c;
	private static int ID_sequence = 000;


	public WorkOrder(String status, Client c, Device d, String date, double cost, double price) {
		this.status = status;
		this.c = c;
		this.d = d;
		this.number = ID_sequence++;
		this.date = date;
		this.cost = cost;
		this.price = price;

	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return c.getName();
	}

	public String getEmail() {
		return c.getEmail();
	}

	public String getPhone() {
		return c.getPhone();
	}

	public String getModel() {
		return d.getModel();
	}

	public String getManufacture() {
		return d.getManufacture();

	}

	public String getTrouble() {
		return d.getTrouble();

	}

	public long getNumber() {
		return number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

}
