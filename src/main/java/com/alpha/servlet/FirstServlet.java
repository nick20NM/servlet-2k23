package com.alpha.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {
	
	ServletConfig config;

	@Override
	public void destroy() {
		System.out.println("destroy() method");
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

	@Override
	public String getServletInfo() {
		return "this servlet is created by NM";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		this.config=config;
		System.out.println("init() method");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service() method");
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.println("<h1>output from first servet</h1>");
		writer.println("<h1>"+new Date()+"</h1>");
	}
	
	

}
