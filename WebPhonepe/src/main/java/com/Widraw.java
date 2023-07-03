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

public class Widraw extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int acc=Integer.parseInt(request.getParameter("uacc"));

    String pan=request.getParameter("upan");
        int phn=Integer.parseInt(request.getParameter("uphn"));
        int amount=Integer.parseInt(request.getParameter("uamount"));
   
        

        response.setContentType("text/html");
        try {        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root", "Sqlreset123@#");
 
            if(acc!=0) {
        	      PreparedStatement pstmt=con.prepareStatement("update bank set balance=balance-? where acc=?");

        	      pstmt.setInt(1, amount);
        	      pstmt.setInt(2, acc);
                  pstmt.execute();
                  pstmt.close();
        	  }
      
      
      else if(pan!=null) {
        PreparedStatement pstmt=con.prepareStatement("update bank set balance = balance-? where pan=?");

        pstmt.setInt(1, amount);
        pstmt.setString(2, pan);
        pstmt.execute();
        pstmt.close();
     }
     

     else if(phn!=0) {
  	      PreparedStatement pstmt=con.prepareStatement("update bank set balance = balance-? where phn=?");

  	      pstmt.setInt(1, amount);
  	      pstmt.setInt(2, phn);
            pstmt.execute();
            pstmt.close();
  	  }
   
   
//            PreparedStatement pstmt=con.prepareStatement("update bank set balance=balance-? where accno=? or pan=? or phn=? ");
//
//
//                pstmt.setInt(1, amount);
//                pstmt.setInt(2, acc);
//                pstmt.setString(3, pan);
//                pstmt.setInt(4, phn);
//
//                pstmt.execute();
//            pstmt.close();

   PrintWriter out=response.getWriter();
   out.print("<h3>Data updated Sucessfully...!<h3>");
   out.print("<br>");
   out.print("<h3>");
   out.print(" <a href='Home.html'>Home</a>");
   out.print("</h3>");

        } 
        catch (Exception e) {
            System.out.println(e);
        }

	}



}
