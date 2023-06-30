package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DeleteRecord extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int id=Integer.parseInt(request.getParameter("uid"));

	        PrintWriter out=response.getWriter();
		  try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","Sqlreset123@#");

           PreparedStatement  pstmt=con.prepareStatement("delete from employee where id =?");      
 
           pstmt.setInt(1, id);
           
           pstmt.execute();
           
           out.print("<h1>");
           out.print("data deleted successfully.....");
           out.print("<a href='Index.html'>HOME PAGE</a>");
           out.print("</h1>");
    
       }
       catch(Exception e)
       {
           System.out.println(e);    
       }

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
