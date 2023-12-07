package com.pharmacysystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pharmacysystem.management.management;
import com.pharmacysystem.model.sales;

public class salesdao {
	private management conn = new management();
	private Connection con;
	private String query;

	public int insert(int code, String Product_name, int Quantity, double price, double total, String invoice_date,
			int invoice_number) {
		try {
			query = "insert into sales (code,Product_name,Quantity,price,total,"
					+ "invoice_date,invoice_number) values(?,?,?,?,?,?,?)";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, code);
			statement.setString(2, Product_name);
			statement.setInt(3, Quantity);
			statement.setDouble(4, price);
			statement.setDouble(5, total);
			statement.setString(6, invoice_date);
			statement.setInt(7, invoice_number);
			int ret = statement.executeUpdate();
			con.close();
			statement.close();
			return ret;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;

	}

	public List<sales> selectWithInv(int invoice_number) {
		try {

			query = "select * from sales where invoice_number=? ";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, invoice_number);
			ResultSet sale = statement.executeQuery();
			List<sales> sales = new ArrayList<>();
			while (sale.next()) {
				int id = sale.getInt("id");
				int code = sale.getInt("Code");
				String name1 = sale.getString("Product_name");
				int Quantity = sale.getInt("Quantity");
				double Price = sale.getDouble("Price");
				double total = sale.getDouble("total");
				String date = sale.getString("invoice_date");
				int inv_num = sale.getInt("invoice_number");
				sales sal = new sales(code, name1, Quantity, Price, total, date, inv_num);
				sal.setId(id);
				sales.add(sal);
			}
			statement.close();
			con.close();
			return sales;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public List<sales> selectWithDate(String invoice_date) {
		try {

			query = "select * from sales where invoice_date=? ";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, invoice_date);
			ResultSet sale = statement.executeQuery();
			List<sales> sales = new ArrayList<>();
			while (sale.next()) {
				int id = sale.getInt("id");
				int code = sale.getInt("Code");
				String name1 = sale.getString("Product_name");
				int Quantity = sale.getInt("Quantity");
				double Price = sale.getDouble("Price");
				double total = sale.getDouble("total");
				String date = sale.getString("invoice_date");
				int inv_num = sale.getInt("invoice_number");
				sales sal = new sales(code, name1, Quantity, Price, total, date, inv_num);
				sal.setId(id);
				sales.add(sal);
			}
			statement.close();
			con.close();
			return sales;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public List<sales> selectallsales() {
		try {

			query = "select* from sales";
			con = conn.getconnection();
			Statement statement = con.createStatement();
			ResultSet sale = statement.executeQuery(query);
			List<sales> sales = new ArrayList<>();
			while (sale.next()) {
				int id = sale.getInt("id");
				int code = sale.getInt("Code");
				String name1 = sale.getString("Product_name");
				int Quantity = sale.getInt("Quantity");
				double Price = sale.getDouble("Price");
				double total = sale.getDouble("total");
				String date = sale.getString("invoice_date");
				int inv_num = sale.getInt("invoice_number");
				sales sal = new sales(code, name1, Quantity, Price, total, date, inv_num);
				sal.setId(id);
				sales.add(sal);
			}
			statement.close();
			con.close();
			return sales;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
