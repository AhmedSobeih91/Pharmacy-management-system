package com.pharmacysystem;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pharmacysystem.dao.usersdao;
import com.pharmacysystem.model.users;

@WebServlet("/resetpassword")
public class resetpassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public resetpassword() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String username = request.getParameter("username");
			int pass = Integer.parseInt(request.getParameter("password"));
			usersdao userdao = new usersdao();
			users user = userdao.select(username);
			if (username.equals(user.getUsername())) {
				userdao.update(username, pass);
				RequestDispatcher dispatcher = request.getRequestDispatcher("resetpassword.jsp");
				dispatcher.include(request, response);
			}
		} catch (Exception ex) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("errorpagereset.jsp");
			dispatcher.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
