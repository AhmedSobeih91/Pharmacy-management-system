package com.pharmacysystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pharmacysystem.dao.purchasesdao;
import com.pharmacysystem.model.item;
import com.pharmacysystem.model.purchases;

@WebServlet("/inv")
public class inv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public inv() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int code = Integer.parseInt(request.getParameter("cod"));
			int quantity = Integer.parseInt(request.getParameter("quant"));
			purchasesdao add = new purchasesdao();
			purchases pur = add.selectonepurchases(code);
			int code1= pur.getCode();
			String name= pur.getProduct_Name();
			int quantity1= quantity;
			double price= pur.getSelling_price();
			double total= pur.getSelling_price() * quantity;
			item it= new item(code1,name,quantity1,price,total);
			List<item> listitem=(List<item>)request.getSession().getAttribute("listitem");
			if( listitem==null) {
				listitem= new ArrayList<>();
			}
			listitem.add(it);
			request.getSession().setAttribute("listitem", listitem);
			double totalprice=0;
			for(item x:listitem) {
			totalprice += x.getTotal() ;
			request.setAttribute("totalprice", totalprice);
			}
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
