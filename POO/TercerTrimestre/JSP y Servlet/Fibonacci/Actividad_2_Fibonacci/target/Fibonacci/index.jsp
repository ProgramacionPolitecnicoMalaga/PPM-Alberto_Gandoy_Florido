<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Serie Fibonacci</title>
</head>
<body>
<%
    PrintWriter printer = response.getWriter();
    printer.print("La serie es: " + request.getParameter("numeroFibo"));
    String res = (String) request.getAttribute("fibo");
    printer.print("<br>" + res);
%>
</body>
</html>