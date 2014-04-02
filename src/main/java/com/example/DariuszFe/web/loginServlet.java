package com.example.DariuszFe.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.DariuszFe.domain.User;
import com.example.DariuszFe.domain.rejestracja;

@WebServlet("/loginServlet.jsp")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("login.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		rejestracja rej = new rejestracja();
		
		rej.setLogin(request.getParameter("login"));
		rej.setPassword(request.getParameter("password"));
		
		if(rej.validate()){
			response.sendRedirect("getPersonData.jsp");
		}else{
			response.sendRedirect("logRej.jsp");
		}
	
		
	}

}
