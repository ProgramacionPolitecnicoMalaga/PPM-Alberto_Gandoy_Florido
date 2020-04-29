<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultado De La Suma</title>
</head>
<body>
<%
    PrintWriter printer = response.getWriter();
    printer.print("Los números sumados son: " + request.getParameter("num1") + " + " + request.getParameter("num2"));
    String resultadoSuma = (String) request.getAttribute("lista_suma");
    printer.print("<br>El resultado de la suma es: " + resultadoSuma);
%>
</body>
</html>
