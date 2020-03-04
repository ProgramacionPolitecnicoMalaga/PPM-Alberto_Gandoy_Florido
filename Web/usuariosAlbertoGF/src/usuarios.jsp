<%@ page import="com.google.gson.*" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>

<%
    //Recepción de parámetros
    String accion = request.getParameter("accion");
    String nick = request.getParameter("txtNick");
    String correo = request.getParameter("txtCorreo");
    String nomApe = request.getParameter("txtNomApe");
    String result = "";
    Integer items = 0;
    String html = "<table class='table'>" +
            "  <thead>" +
            "    <tr>" +
            "      <th scope='col'>ID</th>" +
            "      <th scope='col'>NICK</th>" +
            "      <th scope='col'>CORREO</th>" +
            "      <th scope='col'>NOMBRE</th>" +
            "    </tr>" +
            "  </thead>";

    //Conexión a la base de datos
    try {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://vps456458.ovh.net:3306/LOGINS?useUnicode=yes&characterEncoding=UTF-8";
        String usuario = "remoto";
        String clave = "malagaserade2Bproximamente";
        Class.forName(driver);
        Connection conexion = DriverManager.getConnection(url, usuario, clave);
        Statement stmt = conexion.createStatement();
        if (accion.equals("guardar")) {//
            stmt.executeUpdate("INSERT INTO USUARIOS (NICK,CORREO,NOMAPE) VALUES ('"+nick+"','"+correo+"','"+nomApe+"')");

          /*  while (rs.next()) {
                items++;
                html += "<tr><td>" + rs.getString("ID") + "<td>";
                html += "<td>" + rs.getString("NICK") + "<td>";
                html += "<td>" + rs.getString("CORREO") + "<td>";
                html += "<td>" + rs.getString("NOMAPE") + "</td></tr>";
            }*/
        }
        html += "</tboby></table>";
        result = "{\"status\":\"ok\",\"html\" : \"" + html + "\",\"items\":" + items + "}";

    } catch (Exception ex) {
        result = "{\"status\":\"ko\",\"mensaje\" : \"" + ex.toString() + "\"}";
    }

    //Generación de la salida
    String json = new Gson().toJson(result);
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(json);
%>