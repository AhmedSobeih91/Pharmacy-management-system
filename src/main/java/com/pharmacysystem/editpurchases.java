package com.pharmacysystem;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pharmacysystem.dao.purchasesdao;

@WebServlet("/editpurchases")
public class editpurchases extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public editpurchases() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int code = Integer.parseInt(request.getParameter("code1"));
			String pro_name = request.getParameter("pro_name1");
			String pur_date = request.getParameter("pur_date1");
			String ex_date = request.getParameter("ex_date1");
			int quantity = Integer.parseInt(request.getParameter("qu1"));
			double pur_p = Double.parseDouble(request.getParameter("pur_p1"));
			double sell_p = Double.parseDouble(request.getParameter("sell_p1"));
			;
			// double total = Double.parseDouble(request.getParameter("total1"));;
			String supp_name = request.getParameter("supp_name1");
			;
			purchasesdao pur_new = new purchasesdao();
			pur_new.update(code, pro_name, pur_date, ex_date, quantity, pur_p, sell_p, supp_name);
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
