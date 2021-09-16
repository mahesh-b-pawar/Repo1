package com.insurance;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginDetails implements Servlet {
ServletConfig config=null;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		
	
		return this.config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return config.getServletName();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method executed");
		this.config=config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("logindetails reached");
		String email=req.getParameter("em");
		String password=req.getParameter("pass1");
		System.out.println(email);
		System.out.println(password);
		
		PrintWriter pw=res.getWriter();
		pw.println("<h1>email is"+email+"</h1>");
		pw.println("<h1>pass is "+password+"</h1>");

		
		ServletConfig config=getServletConfig();
		System.out.println("servlet name is: "+config.getServletName());
		
		String n=config.getInitParameter("email");
		String p=config.getInitParameter("password");
		
		
		
		
		
		
		
		RequestDispatcher rd=null;
		if(email.equalsIgnoreCase(n) && password.equalsIgnoreCase(p)){
			rd=req.getRequestDispatcher("Details.jsp");
			rd.forward(req,res);
		}
		else {
			rd=req.getRequestDispatcher("failure.html");
			rd.forward(req,res);
			
			
		}
		
	}

	
	
	
}
