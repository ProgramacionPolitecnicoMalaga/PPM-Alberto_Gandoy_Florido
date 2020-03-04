<%@ page import="com.google.gson.*" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>

<%
    //Recepción de parámetros
    String accion = request.getParameter("accion");
    String nick = request.getParameter("nick");
    String voto = request.getParameter("voto");
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

        if (accion.equals("obtener")) {

            ResultSet  rs = stmt.executeQuery("SELECT ID FROM USUARIOS WHERE NICK = '" + nick + "'");
            rs.next();
            String idVotado = rs.getString(1);
            stmt.executeUpdate("INSERT INTO VOTOS (IDVOTANTE,VOTO,IDVOTADO) VALUES ('"+idVotado+"','"+voto+"',,'"+IidVotado+"')");

        }  else if (accion.equals("read")) {//
            ResultSet rS = stmt.executeQuery("SELECT * FROM VOTOS");
          while (rS.next()) {
                items++;
                html += "<tr><td>" +rS.getString("ID")  + "<td>";
                html += "<td>" + rS.getString("IDVOTANTE") + "<td>";
                html += "<td>" + rS.getString("IDVOTADO") + "<td>";
                html += "<td>" + rS.getString("VOTO") + "</td></tr>";
            }
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