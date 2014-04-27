package com.example.DariuszFe.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/form")
public class FormServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>What is you favorite Sport</h2>" +
				"<form action='data'>" +
				"Alias: <input type='text' name='firstName' /> <br />" +
				"<input type='checkbox' name='hobby' value='bicycle'>I like riding a bicycle<br />" +
				"<input type='checkbox' name='hobby' value='run'>I like running <br />" +
				"<input type='checkbox' name='hobby' value='voleyball'>I like play volleyball<br />" +
				"<input type='checkbox' name='hobby' value='football'>I like play football<br />" +
				"<input type='submit' value=' OK ' />" +
				"</form>" +
				"</body></html>");
		out.close();
	}

}
