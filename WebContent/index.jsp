<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center" style="color: red;">This project is based on servlet and jsp !!</h1>

<hr>

<div class="container" align="center" style="color: green">
  
   <a href="Register.jsp">Registration</a><br>
   <a href="Login.jsp">Login</a><br>
   <a href="ViewEmployee">View Employees</a>

</div>

<h1> Welcome:  <%= session.getAttribute("name") %></h1>


<hr>
</body>
</html>