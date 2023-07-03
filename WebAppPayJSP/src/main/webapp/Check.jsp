<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Information</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>


        .container {
            margin-top: 50px;
        }

    h4 {
            margin-bottom: 20px;
           
        }

        .table {
            color: #616A6B;
        }

      .table th {
            color: red;
        }
</style>
</head>
<body>
<div class="container">
<%
            try {
                ServletContext context = getServletContext();
             	  Class.forName("com.mysql.cj.jdbc.Driver");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","Sqlreset123@#");
                  

 

                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("select * from bank");

 

                out.print("<h4>Account Details</h4>");
                out.print("<table class='table'>");
                out.print("<thead class='thead-dark'>");
                out.print("<tr>");
                out.print("<th scope='col'>ID</th>");
                out.print("<th scope='col'>NAME</th>");
                out.print("<th scope='col'>ACC No.</th>");
                out.print("<th scope='col'>IFSC Code</th>");
                out.print("<th scope='col'>PAN CARD</th>");
                out.print("<th scope='col'>PHONE No.</th>");
                out.print("<th scope='col'>AADHAR No.</th>");
                out.print("<th scope='col'>BALANCE</th>");
                out.print("</tr>");
                out.print("</thead>");
                out.print("<tbody>");

 

                while(r.next()) {
                    out.print("<tr>");
                    out.print("<td>" + r.getInt(1) + "</td>");
                    out.print("<td>" + r.getString(2) + "</td>");
                    out.print("<td>" + r.getString(3) + "</td>");
                    out.print("<td>" + r.getString(4) + "</td>");
                    out.print("<td>" + r.getString(5) + "</td>");
                    out.print("<td>" + r.getString(6) + "</td>");
                    out.print("<td>" + r.getString(7) + "</td>");
                    out.print("<td>" + r.getInt(8) + "</td>");
                    out.print("</tr>");
                }

 

                out.print("</tbody>");
                out.print("</table>");

 

                out.print("<a href='Home.html'>Home page</a>");
            } catch(Exception e) {
                System.out.println(e);
            }
        %>
</div>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

