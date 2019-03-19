package com.home.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dispatcher")
public class Dispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Dispatcher() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("first_name");
		PrintWriter exit = response.getWriter();
		response.setContentType("text/html");
		exit.print("<html><body><h1>Hola " + name + " , soy el servlet.</h1></body></html>"
				+ "<form action=\"SecondDispatcher\" method=\"get\">\r\n" + 
				"Height: <input type=\"text\" height=\"height1\"><br/>\r\n" + 
				"Weight: <input type=\"text\" weight=\"weight1\">\r\n" + 
				"<input type=\"submit\" value=\"Submit\">");
		exit.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
