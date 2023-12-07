package com.pharmacysystem;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pharmacysystem.dao.purchasesdao;

@WebServlet("/newProduct")
public class newProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public newProduct() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int code = Integer.parseInt(request.getParameter("code"));
			String pro_name = request.getParameter("pro_name");
			String pur_date = request.getParameter("pur_date");
			String ex_date = request.getParameter("ex_date");
			int quantity = Integer.parseInt(request.getParameter("qu"));
			double pur_p = Double.parseDouble(request.getParameter("pur_p"));
			double sell_p = Double.parseDouble(request.getParameter("sell_p"));
			// double total = Double.parseDouble(request.getParameter("total"));
			String supp_name = request.getParameter("supp_name");
			purchasesdao pur_new = new purchasesdao();
			pur_new.insert(code, pro_name, pur_date, ex_date, quantity, pur_p, sell_p, supp_name);
			response.sendRedirect("addpurchases.jsp");
		} catch (Exception ex) {
			response.sendRedirect("errorpurchase2.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
