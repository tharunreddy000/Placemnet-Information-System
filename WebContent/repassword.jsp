<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="Post">
<%
  String e=request.getParameter("name");
%>
    <input name="name" value="<%=e%>" type="hidden">
    <input type="password" placeholder="NEW PASSWORD" name="newpass" required>
    </form>
</body>
</html>
