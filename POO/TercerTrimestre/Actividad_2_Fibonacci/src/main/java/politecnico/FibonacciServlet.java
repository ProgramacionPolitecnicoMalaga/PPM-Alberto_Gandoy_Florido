package politecnico;

import politecnico.Modelo.Fibonacci;
import politecnico.Modelo.FibonacciException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FibonacciServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
        Fibonacci fibonacci = new Fibonacci();
        String parametroFibo = fibonacci.mostrarSerie(Integer.parseInt(req.getParameter("numeroFibo")));
        req.setAttribute("fibo", parametroFibo);
        RequestDispatcher view = req.getRequestDispatcher("index.jsp");
        view.forward(req,resp);
        } catch (FibonacciException e) {
            e.printStackTrace();
        }
    }
}
