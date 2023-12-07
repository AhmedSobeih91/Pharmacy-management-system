package com.pharmacysystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pharmacysystem.management.management;
import com.pharmacysystem.model.suppliers;

public class suppliersdao {
	private management conn = new management();
	private Connection con;
	private String query;

	public int insert( String supplier_name, String address, int tax_number, long phone_number) {
		try {
			query = "insert into suppliers (supplier_name,address,tax_number,phone_number)"
					+ " values(?,?,?,?)";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, supplier_name);
			statement.setString(2, address);
			statement.setInt(3, tax_number);
			statement.setDouble(4, phone_number);
			int ret = statement.executeUpdate();
			con.close();
			statement.close();
			return ret;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;

	}

	public int update(int id, String supplier_name, String address, int tax_number, long phone_number) {
		try {
			query = "update suppliers set supplier_name=?,address=?,tax_number=?,phone_number=? where id=? ";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, supplier_name);
			statement.setString(2, address);
			statement.setInt(3, tax_number);
			statement.setDouble(4, phone_number);
			statement.setInt(5, id);
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
			query = "delete from suppliers where id=? ";
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

	public suppliers select(String supplier_name) {
		try {

			query = "select * from suppliers where supplier_name=? ";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, supplier_name);
			ResultSet supplier = statement.executeQuery();
			while (supplier.next()) {
				int id = supplier.getInt("id");
				String name1 = supplier.getString("supplier_name");
				String address = supplier.getString("address");
				int tax = supplier.getInt("tax_number");
				long phone = supplier.getLong("phone_number");
				suppliers supp = new suppliers(id, name1, address, tax, phone);
				statement.close();
				con.close();
				return supp;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public List<suppliers> selectallsuppliers() {
		try {

			query = "select* from suppliers";
			con = conn.getconnection();
			Statement statement = con.createStatement();
			ResultSet supplier = statement.executeQuery(query);
			List<suppliers> suppliers1 = new ArrayList<>();
			while (supplier.next()) {
				int id = supplier.getInt("id");
				String name1 = supplier.getString("supplier_name");
				String address = supplier.getString("address");
				int tax = supplier.getInt("tax_number");
				long phone = supplier.getLong("phone_number");
				suppliers supp = new suppliers(id, name1, address, tax, phone);
				suppliers1.add(supp);
			}
			statement.close();
			con.close();
			return suppliers1;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
