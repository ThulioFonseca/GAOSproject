package aplication;



public class WorkOrder {
	private String status;
	private long number;
	private String date;
	private double cost;
	private double price;
	private Device d;
	private Client c;

	public WorkOrder(String status, Client c, Device d, long number, String date, double cost, double price) {
		this.status = status;
		this.c = c;
		this.d = d;
		this.number = number;
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

	public long getPhone() {
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

	public void setNumber(long number) {
		this.number = number;
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
