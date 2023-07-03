<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f1f1f1;
            margin: 0;
            padding: 20px;
        }

        h1 {
            color: #333333;
        }

        a {
            color: #007bff;
            text-decoration: none;
        }

        table {
            border-collapse: collapse;
            margin: 20px auto;
            text-align: left;
            
        }

        td {
            padding: 10px;
        }
</style>
</head>
<body>
<%
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
    
    out.print("<h1>Account Created Successfully!</h1>");
    out.print("<table>");
    out.print("<tr><td>Id:</td><td>" + id + "</td></tr>");
    out.print("<tr><td>Name:</td><td>" + name + "</td></tr>");
    out.print("<tr><td>Account No:</td><td>" + acc + "</td></tr>");
    out.print("<tr><td>IFSC:</td><td>" + ifsc + "</td></tr>");
    out.print("<tr><td>PAN:</td><td>" + pan + "</td></tr>");
    out.print("<tr><td>Phone No:</td><td>" + phn + "</td></tr>");
    out.print("<tr><td>Aadhar:</td><td>" + adhar + "</td></tr>");
    out.print("<tr><td>Initial Balance:</td><td>" + balance + "</td></tr>");
    out.print("</table>");



    out.print("<a href='Home.html'>Home page</a>");



} catch (Exception e) {
    System.out.println(e);
}
    
/*     PreparedStatement pstmt=con.prepareStatement("insert into bank values(?,?,?,?,?,?,?,?)");


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


out.print("Data Inserted Sucessfully...!");
out.print("<br>");
out.print("<h3>");
out.print("<a href='Home.html'> Home </a>");
out.print("</h3>"); */

%>
</body>
</html>