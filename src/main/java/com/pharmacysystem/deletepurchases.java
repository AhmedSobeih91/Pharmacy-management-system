package com.pharmacysystem;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pharmacysystem.dao.purchasesdao;

@WebServlet("/deletepurchases")
public class deletepurchases extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public deletepurchases() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			int code = Integer.parseInt(request.getParameter("code"));
			purchasesdao pur = new purchasesdao();
			pur.delete(code);
			response.sendRedirect("addpurchases.jsp");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
