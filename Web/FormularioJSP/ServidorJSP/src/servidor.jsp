<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<%
    String username=request.getParameter("username");
    String email=request.getParameter("email");
    String division=request.getParameter("division");
    String tel=request.getParameter("tel");
    long phone = Long.parseLong(tel);
%>

<h3>Nombre : <%=username %></h3>
<h3>Correo : <%=email %></h3>
<h3>Edad : <%=division %></h3>
<h3>Telefono : <%=phone %></h3>
</body>
</html>
