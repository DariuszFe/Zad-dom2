package com.example.DariuszFe.web;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class register extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        try{
        
        //loading driver 
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
          Connection  con=DriverManager.getConnection
                     ("jdbc:mysql://localhost:3306/student","root","Ig49RBJO");

        PreparedStatement ps=con.prepareStatement
                  ("insert into Student values(?,?,?)");

        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, pass);
        int i=ps.executeUpdate();
        
        if(i>0)
        {
            out.println("You are sucessfully register");
        }
        
        }catch(Exception se)
        {
            se.printStackTrace();
        }
	
      }
  }