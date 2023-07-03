<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
          <%
          response.setContentType("text/html");
          try {
        	  Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","Sqlreset123@#");
              
              Statement stmt = con.createStatement();
              ResultSet rs = stmt.executeQuery("select * from employee");
          
              out.print("<h4>");
             while(rs.next()) {
            	 out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5));
                 out.print("<br>");
             } 
             out.print("<a href='Entry.html'>HOME PAGE</a>");
              out.print("</h4>");
          }
          catch(Exception e)
          {
              System.out.println(e);    
          } 
          
          %>
</body>
</html>