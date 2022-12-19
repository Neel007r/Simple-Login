package com.telusko;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		LoginDao dao = new LoginDao();
		
		
		if(dao.check(name, password)) {
			
		//if(name.equals("admin") && password.equals("admin123")) {
			
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
			
			response.sendRedirect("welcome.jsp");
		}
		else {
			response.sendRedirect("index.jsp");
		}
	}

}
