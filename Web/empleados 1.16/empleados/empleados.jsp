<%@ page import="com.google.gson.Gson" %>
<%@page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.util.logging.Logger" %>


<%
    //Recepción de parámetros
    String accion = request.getParameter("accion");
    String txtID = request.getParameter("txtId");
    String txtNombre = request.getParameter("txtNombre");
    String txtApellidos = request.getParameter("txtApellidos");
    String txtFecha = request.getParameter("txtFecha");
    String result = "";
    Integer items = 0;
    String html = "<table class='table'>" +
            "  <thead>" +
            "    <tr>" +
            "      <th scope='col'>#</th>" +
            "      <th scope='col'>Nombre</th>" +
            "      <th scope='col'>Apellidos</th>" +
            "      <th scope='col'>Fecha nacimiento</th>" +
            "    </tr>" +
            "  </thead><tbody>";

    //Conexión a la base de datos
    try {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://vps456458.ovh.net:3306/INMOLOSA?useUnicode=yes&characterEncoding=UTF-8";
        String usuario = "remoto";
        String clave = "malagaserade2Bproximamente";
        Class.forName(driver);
        Connection conexion = DriverManager.getConnection(url, usuario, clave);
        Statement stmt = conexion.createStatement();
        if (accion.equals("consulta")) {
            ResultSet rs = stmt.executeQuery("SELECT ID_EMPLEADO,NOMBRE,APELLIDOS,FECHA_NACIMIENTO FROM EMPLEADOS WHERE NOMBRE LIKE '%" + txtNombre + "%'");
            while (rs.next()) {
                items++;
                html += "<tr><td>" + rs.getString("ID_EMPLEADO") + "</td>";
                html += "<td>" + rs.getString("NOMBRE") + "</td>";
                html += "<td>" + rs.getString("APELLIDOS") + "</td>";
                html += "<td>" + rs.getString("FECHA_NACIMIENTO") + "</td></tr>";
            }
        } else if (accion.equals("agregar")) {
                stmt.executeUpdate("INSERT INTO EMPLEADOS(NOMBRE,APELLIDOS,FECHA_NACIMIENTO) VALUES ('" + txtNombre + "','" + txtApellidos + "','" + txtFecha + "')");
        } else if (accion.equals("eliminar")) {
            stmt.executeUpdate("DELETE e.* FROM EMPLEADOS e WHERE ID_EMPLEADO = '"+txtID+"'");
        }else if (accion.equals("modificar")) {
            stmt.executeUpdate("UPDATE EMPLEADOS e SET e.NOMBRE = '"+txtNombre+"' WHERE e.ID_EMPLEADO = '"+txtID+"'");

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
