package aplication;

import java.util.List;

public class Balance {

	private double totalCost = 0;
	private double totalProfit = 0;
	private double totalPayment = 0;

	public double getTotalCost(List<WorkOrder> lista) {

		for (int i = 0; i < lista.size(); i++) {

			totalCost = totalCost + lista.get(i).getCost();

		}

		return totalCost;
	}

	public double getTotalPayment(List<WorkOrder> lista) {

		for (int i = 0; i < lista.size(); i++) {

			totalPayment = totalPayment + lista.get(i).getPrice();

		}

		return totalPayment;

	}

	public double getTotalProfit(List<WorkOrder> lista) {

				totalProfit = totalPayment - totalCost;
		return totalProfit;
	}

}
