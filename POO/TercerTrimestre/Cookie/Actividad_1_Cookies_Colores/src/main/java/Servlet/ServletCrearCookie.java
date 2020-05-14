package Servlet;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

@WebServlet(
        name = "colorCookie", urlPatterns = {"/colorCookie"}
)
public class ServletCrearCookie extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String cadenaEstadoJson = "";
        String cadenaJson = request.getReader().lines().collect(Collectors.joining());
        JSONParser jsonParser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) jsonParser.parse(cadenaJson);
            String colorCliente = (String) jsonObject.get("color");

            Cookie cookie = new Cookie("color", colorCliente);
            response.addCookie(cookie);

            cadenaEstadoJson = "{\"status\":\"ok\",\"color\":\""+colorCliente+"\"}";

        } catch (Exception e) {
            cadenaEstadoJson = "{\"status\":\"ko\"}";
            e.printStackTrace();
        }
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        out.print(cadenaEstadoJson);
    }


}
