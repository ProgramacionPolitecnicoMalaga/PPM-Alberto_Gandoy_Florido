package com.politecnico.Servelt;

import com.politecnico.Modelo.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SumaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Suma suma = new Suma();
        int valor1 = Integer.parseInt(req.getParameter("num1"));
        int valor2 = Integer.parseInt(req.getParameter("num2"));
        String sumatorioNumeros = String.valueOf(suma.sumar(valor1,valor2));
        req.setAttribute("lista_suma", sumatorioNumeros);
        RequestDispatcher view = req.getRequestDispatcher("suma.jsp");
        view.forward(req,resp);
    }
}
