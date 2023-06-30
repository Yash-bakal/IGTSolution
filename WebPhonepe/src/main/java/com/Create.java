package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  int id=Integer.parseInt(request.getParameter("uid"));
          String name=request.getParameter("uname");
          int acc=Integer.parseInt(request.getParameter("uacc"));
          String ifsc=request.getParameter("uifsc");
          String pan=request.getParameter("upan");
          int phn=Integer.parseInt(request.getParameter("uphn"));
          int adhar=Integer.parseInt(request.getParameter("uadhar"));
          int balance=Integer.parseInt(request.getParameter("ubalance"));
          response.setContentType("text/html");

          try {        
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root", "Sqlreset123@#");

              PreparedStatement pstmt=con.prepareStatement("insert into bank values(?,?,?,?,?,?,?,?)");


                  pstmt.setInt(1, id);
                  pstmt.setString(2, name);
                  pstmt.setInt(3, acc);
                  pstmt.setString(4, ifsc);
                  pstmt.setString(5, pan);
                  pstmt.setInt(6, phn);
                  pstmt.setInt(7, adhar);
                  pstmt.setInt(8, balance);
                  pstmt.execute();

              pstmt.close();


          } 
          catch (Exception e) {
              System.out.println(e);
          }

          PrintWriter out=response.getWriter();
          out.print("Data Inserted Sucessfully...!");
          out.print("<br>");
          out.print("<h3>");
          out.print("<a href='Home.html'> Home </a>");
          out.print("</h3>");

	}



}
