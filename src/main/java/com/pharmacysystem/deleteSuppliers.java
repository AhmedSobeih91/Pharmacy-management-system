package com.pharmacysystem;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pharmacysystem.dao.suppliersdao;

@WebServlet("/delete")
public class deleteSuppliers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public deleteSuppliers() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			int id = Integer.parseInt(request.getParameter("id"));
			suppliersdao supp = new suppliersdao();
			supp.delete(id);
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
