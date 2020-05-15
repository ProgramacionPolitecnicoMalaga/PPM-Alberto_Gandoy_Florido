package Servlet;

import Modelo.Persona;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.stream.Collectors;

@WebServlet(
        name="iniciar",
        urlPatterns = {"/iniciar"}
)
public class SesionServlet extends HttpServlet {
    private RequestDispatcher dispatcher = null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Persona persona = (Persona) session.getAttribute("persona");

        if (persona == null) {
            dispatcher = req.getRequestDispatcher("SesionCerrada.jsp");
        } else {
            req.setAttribute("persona",persona);
            dispatcher = req.getRequestDispatcher("SesionIniciada.jsp");
        }
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Persona persona = (Persona) session.getAttribute("persona");

        if (persona == null) {
            String json = req.getReader().lines().collect(Collectors.joining());
            JSONParser parser = new JSONParser();

            try {
                JSONObject jsonObject = (JSONObject) parser.parse(json);
                String nombre = (String) jsonObject.get("nombre");
                int edad = Integer.parseInt((String) jsonObject.get("edad"));
                String fecha = String.valueOf(jsonObject.get("fecha"));
                persona = new Persona(nombre,edad,fecha);
            } catch (ParseException e) {
                persona = new Persona("NULL",0, "NULL");
            }
            session.setAttribute("persona",persona);
            req.setAttribute("persona",persona);
            dispatcher = req.getRequestDispatcher("SesionIniciada.jsp");
        } else {
            dispatcher = req.getRequestDispatcher("SesionIniciada.jsp");
        }
        dispatcher.forward(req,resp);
    }

}
