package com.pharmacysystem;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pharmacysystem.dao.usersdao;
import com.pharmacysystem.model.users;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public login() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String username = request.getParameter("login");
			int pass = Integer.parseInt(request.getParameter("pass"));
			usersdao userdao = new usersdao();
			users user = userdao.select(username);
			if (username.equals(user.getUsername()) && pass == user.getPassword()) {
				HttpSession session=request.getSession();
				session.setAttribute("username", username);
				session.setAttribute("pass", pass);	
				RequestDispatcher dispatcher = request.getRequestDispatcher("startpage.jsp");
				dispatcher.forward(request, response);
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("errorpageuser.jsp");
				dispatcher.forward(request, response);
			}
		} catch (Exception ex) {

			RequestDispatcher dispatcher = request.getRequestDispatcher("errorpageuser.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
