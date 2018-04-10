package com.sandy.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Registration extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		HttpSession session=null;
		
		PrintWriter out=response.getWriter();
	
		Long id=Long.parseLong(request.getParameter("id"));
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String country=request.getParameter("country");
		
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","sandhya");  
			  
			PreparedStatement ps=con.prepareStatement(  
			"insert into emp123 values(?,?,?,?)");  
			
			ps.setLong(1,id);
			ps.setString(2,name);
			ps.setString(3,address);
			ps.setString(4,country);
			int i=ps.executeUpdate();
			
			if(i>0)
			{
				out.println("you are successfullly registered!!");
				
				RequestDispatcher rsd=request.getRequestDispatcher("index.jsp");
				rsd.forward(request, response);		
				
				session.setAttribute("name",name);
			}
			else
			{
				out.println("sorry Registration failed!!!");
				RequestDispatcher rsd=request.getRequestDispatcher("Register.jsp");
				rsd.include(request, response);
				
			}
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	  out.close();
		
		
	}

}
