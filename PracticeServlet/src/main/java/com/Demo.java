package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

public class Demo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		int id = Integer.parseInt(request.getParameter("uid"));
		String name = request.getParameter("uname");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","Sqlreset123@#");
			PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?)");
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.execute();
			pstmt.close();
			PrintWriter out = response.getWriter();
            out.print("<h3>servlet page</h3>");
            out.print("ID"+id);
            out.print("<br>Name"+name);
		}
		catch(Exception e){
			System.out.println(e);
		}       
	}
}
