<%@ page import="Concatenador.Concatenacion" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false"%>
<ul>
    <%
        ArrayList<String> words = (ArrayList<String>)  request.getAttribute("concatenado");
        Concatenacion concatenacion = new Concatenacion();
        out.println(
                "<div>"
                        +
                        "La concatenación de " +
                        words.get(0) + ", " +
                        words.get(1) + ", " +
                        words.get(2) + " es: " +
                   concatenacion.concatenador(words)
                        +
                        "<div>"
        );
    %>
</ul>
