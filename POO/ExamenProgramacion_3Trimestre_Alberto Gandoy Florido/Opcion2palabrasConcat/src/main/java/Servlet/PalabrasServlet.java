package Servlet;

import Concatenador.Concatenacion;
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
import java.util.ArrayList;
import java.util.stream.Collectors;

@WebServlet(
        name = "registrado",
        urlPatterns = {"/registrado"}
)
public class PalabrasServlet extends HttpServlet {
    private RequestDispatcher dispatcher = null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        ArrayList<String> concatenaciones = (ArrayList<String>) session.getAttribute("concatenado");

        if (concatenaciones == null) {
            dispatcher = req.getRequestDispatcher("cerrar.jsp");
        } else {
            req.setAttribute("concatenado", concatenaciones);
            dispatcher = req.getRequestDispatcher("abrir.jsp");
        }
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        ArrayList<String> concatenaciones = (ArrayList<String>) session.getAttribute("concatenado");

        if (concatenaciones == null) {
            concatenaciones = new ArrayList<>();
            String json = req.getReader().lines().collect(Collectors.joining());
            JSONParser jsonParser = new JSONParser();
            try {
                JSONObject jsonObject = (JSONObject) jsonParser.parse(json);
                String p1 = (String) jsonObject.get("p1");
                String p2 = (String) jsonObject.get("p2");
                String p3 = (String) jsonObject.get("p3");
                concatenaciones.add(p1);
                concatenaciones.add(p2);
                concatenaciones.add(p3);
            } catch (ParseException e) {
                throw new IllegalArgumentException("No se puedo realizar la concatenación.");
            }
            session.setAttribute("concatenado",concatenaciones);
            req.setAttribute("concatenado",concatenaciones);
            dispatcher = req.getRequestDispatcher("abrir.jsp");
        } else {
            dispatcher = req.getRequestDispatcher("abrir.jsp");
        }
        dispatcher.forward(req,resp);
    }
}
