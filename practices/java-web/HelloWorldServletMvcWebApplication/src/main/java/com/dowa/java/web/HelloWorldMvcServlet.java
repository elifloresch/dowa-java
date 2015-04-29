package com.dowa.java.web;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class HelloWorldMvcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Hello.jsp");

        String name = req.getParameter("name");

        //req.setAttribute("fakeName", StringUtils.reverse(name));
        //requestDispatcher.forward(req, resp);
        ArrayList names = new ArrayList();
        names.add("Miriam");
        names.add("Antonio");
        names.add("El Moy");
        names.add("Ivan");
        names.get(1).equals(1);

        boolean inList = false;

        if (names.contains(name)) {
            inList = true;
            req.setAttribute("inList", inList);
            requestDispatcher.forward(req, resp);
        } else{
            req.setAttribute("inList", inList);
            requestDispatcher.forward(req, resp);
        }
    }
}