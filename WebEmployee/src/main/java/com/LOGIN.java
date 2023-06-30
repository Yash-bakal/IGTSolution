package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LOGIN extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String name=request.getParameter("uname");
	String pass=request.getParameter("upass");
	PrintWriter out = response.getWriter();
	
	if(name.equalsIgnoreCase("Yash")&& pass.equalsIgnoreCase("Yash@123")) {
		RequestDispatcher rd = request.getRequestDispatcher("Index.html");
		rd.forward(request, response);
	
	}
	else {
	out.print("<p style='color: red'> Please try once again</p>");
	RequestDispatcher rd = request.getRequestDispatcher("Login.html");
	rd.include(request, response);
	}
	}

}
