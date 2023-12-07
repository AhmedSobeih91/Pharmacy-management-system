package com.pharmacysystem;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pharmacysystem.dao.suppliersdao;

@WebServlet("/edit")
public class editsuppliers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public editsuppliers() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			String address = request.getParameter("address");
			int tax = Integer.parseInt(request.getParameter("tax_number"));
			long phone = Long.parseLong(request.getParameter("phone_number"));
			suppliersdao supp = new suppliersdao();
			supp.update(id, name, address, tax, phone);
			response.sendRedirect("addsupplier.jsp");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
