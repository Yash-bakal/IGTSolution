package com;

 

import java.io.IOException;
import java.io.PrintWriter;

 

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

public class Demo1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Demo1() {
        super();
        // TODO Auto-generated constructor stub
    }

 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        int a = Integer.parseInt(request.getParameter("aval"));
        int b = Integer.parseInt(request.getParameter("bval"));
        int s = a + b;

        PrintWriter out = response.getWriter();
        out.print("<h1>");
        out.print("The sum is : " + s);
        out.print("</h1>");

    }

 

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

 

}
