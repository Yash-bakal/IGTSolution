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
int num=Integer.parseInt(request.getParameter("unum"));
int amount=Integer.parseInt(request.getParameter("uamount"));

response.setContentType("text/html");
try {        
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root", "Sqlreset123@#");
 
    PreparedStatement pstmt=con.prepareStatement("update bank set balance=balance+? where accno=? or aadhar=? or phn=? ");

        pstmt.setInt(1, amount);
        pstmt.setInt(2, num);
        pstmt.setInt(3, num);
        pstmt.setInt(4, num);

        pstmt.execute();
    pstmt.close();  

out.print("<h3>Amount deposited Sucessfully...!<h3>");
out.print("<br>");
out.print("<h3>");



out.print(" <a href='Home.html'>Home</a>");
out.print("</h3>");

} 
catch (Exception e) {
    System.out.println(e);
}

%>
</body>
</html>