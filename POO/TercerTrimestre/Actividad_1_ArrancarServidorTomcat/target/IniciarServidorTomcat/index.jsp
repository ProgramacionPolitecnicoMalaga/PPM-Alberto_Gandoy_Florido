<%@ page import="java.util.*" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.politecnico.Servlet.SugerenciaCervezaServlet" %>
<%--
  Created by IntelliJ IDEA.
  User: alberto
  Date: 26/04/20
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cervezas</title>
</head>
<body>
<%
    PrintWriter printer = response.getWriter();
    printer.print("La opción es " + request.getParameter("color"));
    List<String> cervezas = (ArrayList<String>) request.getAttribute("lista_cervezas");
    for (String cerveza: cervezas){
        printer.print("<br>prueba " + cerveza);
    }
%>
</body>
</html>