package com.pharmacysystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pharmacysystem.management.management;
import com.pharmacysystem.model.users;

public class usersdao {
	private management conn = new management();
	private Connection con;
	private String query;

	public int insert(String username, int pass) {
		try {
			query = "insert into users values(?,?)";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, username);
			statement.setInt(2, pass);
			int ret = statement.executeUpdate();
			con.close();
			statement.close();
			return ret;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;

	}

	public int update(String username, int pass) {
		try {
			query = "update users set password=? where username=? ";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, pass);
			statement.setString(2, username);
			int ret = statement.executeUpdate();
			con.close();
			statement.close();
			return ret;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	public void delete(String username) {
		try {
			query = "delete from users where username=? ";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, username);
			statement.executeUpdate();
			con.close();
			statement.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public users select(String username) {
		try {

			query = "select * from users where username=? ";
			con = conn.getconnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, username);
			ResultSet user = statement.executeQuery();
			users user1 = null;
			while (user.next()) {
				String username1 = user.getString("username");
				int pass1 = user.getInt("password");
				user1 = new users(username1, pass1);
				statement.close();
				con.close();
				return user1;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
