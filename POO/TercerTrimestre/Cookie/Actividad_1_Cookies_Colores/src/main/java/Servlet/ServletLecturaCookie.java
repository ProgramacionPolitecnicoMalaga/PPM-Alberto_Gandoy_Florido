package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "colorDeFondo", urlPatterns = {"/colorDeFondo"}
)
public class ServletLecturaCookie extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String cadenaEstadoJson = "";
        //http://51.68.123.197:8080/Actividad_1_Cookies_Colores/color.html

        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            cadenaEstadoJson = "{\"status\":\"ko\"}";

        } else if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("color"))
                    cadenaEstadoJson = "{\"status\":\"ok\",\"color\":\""+cookie.getValue()+"\"}";
            }
        }
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        out.print(cadenaEstadoJson);
    }
}
