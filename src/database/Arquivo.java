package database;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import aplication.Client;
import aplication.Device;
import aplication.WorkOrder;

public class Arquivo {

	public void ToFile(String path, WorkOrder WO) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

			bw.write(WO.getNumber() + ";" + WO.getStatus() + ";" + WO.getName() + ";" + WO.getEmail() + ";"
					+ WO.getPhone() + ";" + WO.getManufacture() + ";" + WO.getModel() + ";" + WO.getTrouble() + ";"
					+ WO.getDate() + ";" + WO.getCost() + ";" + WO.getPrice());
			bw.flush();
			bw.newLine();

		}

		catch (IOException e) {

			JOptionPane.showMessageDialog(null, "Error writing file: " + e.getMessage());

		}

	}

	public List<WorkOrder> FromFile(String path) {

		String[] fields = null;
		List<WorkOrder> lista = new ArrayList<WorkOrder>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String itemCSV = br.readLine();

			Client c = new Client(null, null, null);
			Device d = new Device(null, null, null);
			WorkOrder WO = new WorkOrder("", c, d, "", 0, 0);

			while (itemCSV != null) {

				fields = itemCSV.split(";");

				c = new Client(fields[2], fields[4], fields[3]);

				d = new Device(fields[7], fields[5], fields[6]);

				WO = new WorkOrder(fields[1], c, d, fields[8], Double.parseDouble(fields[9]),
						Double.parseDouble(fields[10]));

				lista.add(WO);

				itemCSV = br.readLine();

			}
		}

		catch (IOException e) {

			JOptionPane.showMessageDialog(null, "Error writing file: " + e.getMessage());

		}

		return lista;
	}

}
