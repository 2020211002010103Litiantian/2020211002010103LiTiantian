package com.litiantian.week4.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class register extends HttpServlet {
public class ConfigDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");


        String name = getServletConfig().getInitParameter("name");
        String id = getServletConfig().getInitParameter("id");
        PrintWriter writer = resp.getWriter();
        writer.println("<br> username: " + username);
        writer.println("<br> password: " + password);
        writer.println("<br> email: " + email);
        writer.println("<br> gender: " + gender);
        writer.close();
        writer.println("<p>name: " + name + "<p>");
        writer.println("studentid: " + id);
}
