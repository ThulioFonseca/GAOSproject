package aplication;

public class WorkOrder {

	private long number;
	private String date;
	private double cost;
	private double price;
	private String description;
	
	
	public WorkOrder(long number, String date, double cost, double price,String description) {
		
		this.number=number;
		this.date= date;
		this.cost= cost;
		this.price= price;
		this.description=description;	
		
		
	}
	
}
