package org.nlt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SampleController implements Servlet
{
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		
	}
	

	public ServletConfig getServletConfig() {
	
		return null;
	}
	
	
	public String getServletInfo() {
		
		return null;
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		System.out.println("Good Evening: "+name);
		
		PrintWriter out=res.getWriter();
		out.println("<h1>Good Evening: "+name+"</h1>");
		
	}
	
	public void destroy() {
				
	}
	

}
