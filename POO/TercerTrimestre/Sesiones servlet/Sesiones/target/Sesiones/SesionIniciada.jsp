<%@ page import="Modelo.Persona" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false"%>
<ul>
    <%
        Persona persona = (Persona) request.getAttribute("persona");
        out.println("<li>"
                + persona.getNombre()
                + " " + persona.getEdad() + " "
                + persona.getFecha() +
                "</li>");
    %>
</ul>
