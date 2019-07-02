package aplication;

public class WorkOrder {
	private String status;
	private long number = 000;
	private String date;
	private double cost;
	private double price;
	private Device device;
	private Client cliente;
	private static int ID_sequence = 000;

	public WorkOrder(String status, Client c, Device d, String date, double cost, double price) {
		this.status = status;
		this.cliente = c;
		this.device = d;
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
		return cliente.getName();
	}

	public String getEmail() {
		return cliente.getEmail();
	}

	public String getPhone() {
		return cliente.getPhone();
	}

	public String getModel() {
		return device.getModel();
	}

	public String getManufacture() {
		return device.getManufacture();

	}

	public String getTrouble() {
		return device.getTrouble();

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
