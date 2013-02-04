package com.tomcat7.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/sayhello", loadOnStartup = 1)
public class SayHelloToOpenShiftServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(
				"<h1>Hello from OpenShift at " + new Date() + " !!!</h1>");
	}

}
