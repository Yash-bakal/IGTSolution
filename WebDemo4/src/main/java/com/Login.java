package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String pass=request.getParameter("upass");
		PrintWriter out = response.getWriter();
		
		if(name.equalsIgnoreCase("Yash")&& pass.equalsIgnoreCase("Yash@123")) {
			//RequestDispatcher rd = request.getRequestDispatcher("Home.html");
			//rd.forward(request, response);
			
			out.print("<h1>");
			out.print("Logged In");
			out.print("</h1>");
			
		}
		else {
		out.print("<p style='color: red'> Please try once again</p>");
		RequestDispatcher rd = request.getRequestDispatcher("Login.html");
		rd.include(request, response);
		}
	}

}
