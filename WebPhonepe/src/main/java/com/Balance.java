package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Balance extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try {
      	  Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","Sqlreset123@#");
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from bank");
            PrintWriter out= response.getWriter();
            out.print("<h4>");
           while(rs.next()) {
          	 out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
               out.print("<br>");
           } 
           out.print("<a href='Home.html'>HOME PAGE</a>");
            out.print("</h4>");
        }
        catch(Exception e)
        {
            System.out.println(e);    
        } 
	}


}
