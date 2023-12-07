package com.pharmacysystem;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pharmacysystem.dao.customerdao;
import com.pharmacysystem.dao.salesdao;
import com.pharmacysystem.model.item;

@WebServlet("/inv2")
public class inv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public inv2() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String inv_date = request.getParameter("data");
			int inv_num = Integer.parseInt(request.getParameter("invoice_number"));
			String customer_name = request.getParameter("customer");
			 List<item>listitem=(List<item>) request.getSession().getAttribute("listitem");
		        if(listitem !=null){
		        	for(item ite:listitem){
		        		salesdao sale = new salesdao();
		    			sale.insert(ite.getCode(), ite.getName(), ite.getQuantity(),
		    					ite.getPrice(),ite.getTotal() , inv_date, inv_num);
		        	     }
		        	}
		        
		        HttpSession session=request.getSession(false);
				if(session != null) {
					session.invalidate();
				}
			customerdao custom = new customerdao();
			custom.insert(customer_name, inv_date, inv_num);
			RequestDispatcher req = request.getRequestDispatcher("invoice.jsp");
			req.forward(request, response);
		} catch (Exception ex) {
			RequestDispatcher req = request.getRequestDispatcher("errorpagecode.jsp");
			req.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
