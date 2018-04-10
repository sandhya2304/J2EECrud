package com.sandy.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class login extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		HttpSession session=null;
		
		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("name");
		String pass=req.getParameter("password");
		
		if(name.equals("") || name == null ||pass.equals("") || pass==null)
		{
			out.println("plz enter the password");
		}
		
		if(LoginDao.validate(name, pass))
		{
			RequestDispatcher rsd=req.getRequestDispatcher("index.jsp");
			rsd.forward(req, resp);
			
			session.setAttribute("name",name);
			
		}
		else
		{
			out.println("sorry wrong password");
			RequestDispatcher rsd=req.getRequestDispatcher("Login.jsp");
			rsd.include(req, resp);
			
		}
		
		
		
	}
	
	

}
