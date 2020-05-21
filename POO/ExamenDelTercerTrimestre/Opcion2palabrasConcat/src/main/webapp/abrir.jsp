<%@ page import="Modelo.Suma" %>
<%@ page import="Concatenador.Concatenacion" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false"%>
<ul>
    <%
        ArrayList<String> words = (ArrayList<String>)  request.getAttribute("concatenado");
        Concatenacion concatenacion = new Concatenacion();
        out.println(
                "<p>"
                        +
                concatenacion.concatenador(words)
                        +
                        "</p>"
        );
    %>
</ul>
