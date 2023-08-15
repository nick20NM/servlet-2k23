package com.alpha.calculation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1")
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public S1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		// add
		int sum=num1+num2;
		
		// set attribute in request object
		request.setAttribute("sum", sum);
		
		// forward the request object using RequestDispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("s2");
		dispatcher.forward(request, response);
		
	}

}
