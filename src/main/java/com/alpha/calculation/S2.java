package com.alpha.calculation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s2")
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public S2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2")); 
		
		// product
		int product=n1*n2;
		
		// get attribute from request object
		int sum = (int)request.getAttribute("sum");
		
		PrintWriter writer = response.getWriter();
		writer.println("<h1>");
		writer.println("sum="+sum);
		writer.println("product="+product);
		writer.println("</h1>");
		
	}

}
