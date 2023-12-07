package com.pharmacysystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pharmacysystem.management.management;
import com.pharmacysystem.model.customers;

public class customerdao {
	private management conn = new management();
	private Connection con;
	private String query;

	public int insert(String customer_name, String invoice_date, int invoice_number) {
		try {
			query = "insert into customers (customer_name,invoice_date,invoice_number)" + " values(?,?,?)";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, customer_name);
			statement.setString(2, invoice_date);
			statement.setInt(3, invoice_number);
			int ret = statement.executeUpdate();
			con.close();
			statement.close();
			return ret;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;

	}

	public int update(int id, String customer_name, String invoice_date, int invoice_number) {
		try {
			query = "update customers set customer_name=?,invoice_date=?,invoice_number=?, where id=? ";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, customer_name);
			statement.setString(2, invoice_date);
			statement.setInt(3, invoice_number);
			statement.setInt(4, id);
			int ret = statement.executeUpdate();
			con.close();
			statement.close();
			return ret;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	public void delete(int id) {
		try {
			query = "delete from customers where id=? ";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, id);
			statement.executeUpdate();
			con.close();
			statement.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public customers select(String customer_name) {
		try {

			query = "select * from customer where customer_name=? ";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, customer_name);
			ResultSet customer = statement.executeQuery();
			while (customer.next()) {
				int id = customer.getInt("id");
				String name1 = customer.getString("customer_name");
				String date = customer.getString("invoice_date");
				int inv_num = customer.getInt("invoice_number");
				customers custom = new customers(name1, date, inv_num);
				custom.setId(id);
				statement.close();
				con.close();
				return custom;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public List<customers> selectallcustomers() {
		try {

			query = "select* from customers";
			con = conn.getconnection();
			Statement statement = con.createStatement();
			ResultSet customer = statement.executeQuery(query);
			List<customers> customers = new ArrayList<>();
			while (customer.next()) {
				int id = customer.getInt("id");
				String name1 = customer.getString("customer_name");
				String date = customer.getString("invoice_date");
				int inv_num = customer.getInt("invoice_number");
				customers custom = new customers(name1, date, inv_num);
				custom.setId(id);
				customers.add(custom);
			}
			statement.close();
			con.close();
			return customers;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
