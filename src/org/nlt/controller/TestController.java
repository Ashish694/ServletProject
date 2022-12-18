package org.nlt.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestController implements Servlet
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
		System.out.println("Good Morning: "+name);
		
		
	}
	
	public void destroy() {
		
	}	
}
