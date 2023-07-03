<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<%
String name=request.getParameter("uname");
String pass=request.getParameter("upass");


if(name.equalsIgnoreCase("Yash")&& pass.equalsIgnoreCase("Yash@123")) {
	RequestDispatcher rd = request.getRequestDispatcher("Home.html");
	rd.forward(request, response);
	
//	out.print("<h1>");
//	out.print("Logged In");
//	out.print("</h1>");
	
}
else {
out.print("<p style='color: red'> Please try once again</p>");
RequestDispatcher rd = request.getRequestDispatcher("Login.html");
rd.include(request, response);
}
%>
</body>
</html>