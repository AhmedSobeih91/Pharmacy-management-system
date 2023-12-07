package com.pharmacysystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pharmacysystem.management.management;
import com.pharmacysystem.model.purchases;

public class purchasesdao {
	private management conn = new management();
	private Connection con;
	private String query;

	public int insert(int code, String product_Name, String production_Date, String expiry_Date, int quantity,
			double purchasing_price, double selling_price, String supplier_name) {
		try {
			double total = quantity * purchasing_price;
			query = "insert into purchases values(?,?,?,?,?,?,?,?,?)";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, code);
			statement.setString(2, product_Name);
			statement.setString(3, production_Date);
			statement.setString(4, expiry_Date);
			statement.setInt(5, quantity);
			statement.setDouble(6, purchasing_price);
			statement.setDouble(7, selling_price);
			statement.setDouble(8, total);
			statement.setString(9, supplier_name);
			int ret = statement.executeUpdate();
			con.close();
			statement.close();
			return ret;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;

	}

	public int update(int code, String product_Name, String production_Date, String expiry_Date, int quantity,
			double purchasing_price, double selling_price, String supplier_name) {
		try {
			query = "update purchases set product_Name=?,production_Date=?,expiry_Date=?,"
					+ "quantity=? ,purchasing_price=? , selling_price=?,supplier_name=? where code=? ";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, product_Name);
			statement.setString(2, production_Date);
			statement.setString(3, expiry_Date);
			statement.setInt(4, quantity);
			statement.setDouble(5, purchasing_price);
			statement.setDouble(6, selling_price);
			statement.setString(7, supplier_name);
			statement.setInt(8, code);
			int ret = statement.executeUpdate();
			con.close();
			statement.close();
			return ret;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	public void delete(int code) {
		try {
			query = "delete from purchases where code=? ";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, code);
			statement.executeUpdate();
			con.close();
			statement.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public purchases selectonepurchases(int code) {
		try {

			query = "select * from purchases where code=? ";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, code);
			ResultSet purchase = statement.executeQuery();
			while (purchase.next()) {
				int code1 = purchase.getInt("code");
				String product_Name = purchase.getString("product_Name");
				String Production_Date = purchase.getString("Production_Date");
				String expiry_Date = purchase.getString("expiry_Date");
				int Quantity = purchase.getInt("Quantity");
				double Purchasing_price = purchase.getDouble("Purchasing_price");
				double selling_price = purchase.getDouble("selling_price");
				// double total = purchase.getDouble("total");
				String supplier_name = purchase.getString("supplier_name");
				purchases pur = new purchases(code1, product_Name, Production_Date, expiry_Date, Quantity,
						Purchasing_price, selling_price, supplier_name);
				statement.close();
				con.close();
				return pur;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public List<purchases> select(int code) {
		try {

			query = "select * from purchases where code=? ";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, code);
			ResultSet purchase = statement.executeQuery();
			List<purchases> purchases = new ArrayList<>();
			while (purchase.next()) {
				int code1 = purchase.getInt("code");
				String product_Name = purchase.getString("product_Name");
				String Production_Date = purchase.getString("Production_Date");
				String expiry_Date = purchase.getString("expiry_Date");
				int Quantity = purchase.getInt("Quantity");
				double Purchasing_price = purchase.getDouble("Purchasing_price");
				double selling_price = purchase.getDouble("selling_price");
				// double total = purchase.getDouble("total");
				String supplier_name = purchase.getString("supplier_name");
				purchases pur = new purchases(code1, product_Name, Production_Date, expiry_Date, Quantity,
						Purchasing_price, selling_price, supplier_name);
				purchases.add(pur);
			}
			statement.close();
			con.close();
			return purchases;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public purchases selectwithname(String product_Name) {
		try {

			query = "select * from purchases where product_Name=? ";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, product_Name);
			ResultSet purchase = statement.executeQuery();
			while (purchase.next()) {
				int code = purchase.getInt("code");
				String product_Name1 = purchase.getString("product_Name");
				String Production_Date = purchase.getString("Production_Date");
				String expiry_Date = purchase.getString("expiry_Date");
				int Quantity = purchase.getInt("Quantity");
				double Purchasing_price = purchase.getDouble("Purchasing_price");
				double selling_price = purchase.getDouble("selling_price");
				// double total = purchase.getDouble("total");
				String supplier_name = purchase.getString("supplier_name");
				purchases pur = new purchases(code, product_Name1, Production_Date, expiry_Date, Quantity,
						Purchasing_price, selling_price, supplier_name);
				statement.close();
				con.close();
				return pur;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public List<purchases> selectallsuppliers() {
		try {

			query = "select* from purchases";
			con = conn.getconnection();
			Statement statement = con.createStatement();
			ResultSet purchase = statement.executeQuery(query);
			List<purchases> purchases = new ArrayList<>();
			while (purchase.next()) {
				int code1 = purchase.getInt("code");
				String product_Name = purchase.getString("product_Name");
				String Production_Date = purchase.getString("Production_Date");
				String expiry_Date = purchase.getString("expiry_Date");
				int Quantity = purchase.getInt("Quantity");
				double Purchasing_price = purchase.getDouble("Purchasing_price");
				double selling_price = purchase.getDouble("selling_price");
				// double total = purchase.getDouble("total");
				String supplier_name = purchase.getString("supplier_name");
				purchases pur = new purchases(code1, product_Name, Production_Date, expiry_Date, Quantity,
						Purchasing_price, selling_price, supplier_name);
				purchases.add(pur);
			}
			statement.close();
			con.close();
			return purchases;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
